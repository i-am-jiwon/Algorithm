function solution(arr, n) {
    const answer = [];
    for(let i = 0 ; i < arr.length; i++){
        if(i%2 == arr.length%2){
            answer[i] = arr[i];
        }
        else{
            answer[i] = arr[i]+ n;
        }
    }
    return answer;
}