function solution(num_list, n) {
    var answer = [];
    const first = num_list.slice(n)
    const second = num_list.slice(0,n)
    first.forEach(number=>answer.push(number))
    second.forEach(number=>answer.push(number))
    return [...first,...second];
}