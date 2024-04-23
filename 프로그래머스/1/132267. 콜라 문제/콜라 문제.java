class Solution {
    public int solution(int a, int b, int n) {
        /*
            재귀로 풀어야 할 듯
            n개를 a로 나누고 몫 * b 나머지 리턴
        */
       
        return count(a, b, n, 0);   
    }
    
    private int count(int a, int b, int n, int c){
        if((n+c)<a) return 0;
        else{
            return ((n+c) / a) * b + count(a, b, (n+c)/a*b, (n+c)%a );
        }
    }
    
}