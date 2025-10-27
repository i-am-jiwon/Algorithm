class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp1 = pat.replaceAll("A", "C");
        String tmp2 = tmp1.replaceAll("B", "A");
        String tmp3 = tmp2.replaceAll("C", "B");
        
        if(myString.contains(tmp3)) answer = 1;
        
        return answer ;
    }
}