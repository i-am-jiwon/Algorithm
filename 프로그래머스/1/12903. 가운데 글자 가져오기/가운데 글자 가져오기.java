class Solution {
    public String solution(String s) {
        /*
            가운데 글자 가져오기
            홀수와 짝수 경우를 나누어 문제풀이
        */
        
        return s.length() %2 == 1 
            ? "" +s.charAt(s.length()/2) 
            : "" + s.charAt(s.length()/2 -1) +s.charAt(s.length()/2);
    }
}