function solution(friends, gifts) {
    var mostReceive = 0;
    const log = new Map();
    
    friends.forEach(name => {
        log.set(name, 0)
    })
    
    gifts.forEach(gift =>{
        const {sender, receiver} = splitFriend(gift)
        const senderBefore = log.get(sender)
        const receiverBefore = log.get(receiver)
        log.set(sender, senderBefore+1)
        log.set(receiver, receiverBefore-1)
    })
        
    for(var i = 0; i < friends.length; i ++){
        var tmp = 0;
        for(var j=0; j < friends.length; j++){
            if(i==j) continue;
            const i_j = `${friends[i]} ${friends[j]}`
            const j_i = `${friends[j]} ${friends[i]}`
            
            const countIJ = gifts.filter(gift => gift === i_j).length;
            const countJI = gifts.filter(gift => gift === j_i).length;
            
            if(countIJ > countJI) tmp ++;
            if(countIJ == countJI){
                const iLog = log.get(friends[i])
                const jLog = log.get(friends[j])
                
                if (iLog > jLog) tmp++;
            }
        }
        mostReceive = mostReceive > tmp ? mostReceive : tmp;
    }
    
    return mostReceive;
}

function splitFriend(gitfString){
    let sender = gitfString.split(' ')[0]
    let receiver = gitfString.split(' ')[1]
    
    return {sender: sender, receiver: receiver}
}
