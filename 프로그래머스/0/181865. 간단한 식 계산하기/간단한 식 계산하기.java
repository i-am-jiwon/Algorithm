class Solution {
    public int solution(String binomial) {
        String tmpStr = binomial.replaceAll(" ", "");
        String[] numStr = tmpStr.split("\\+|\\-|\\*");
        if(binomial.contains("+")) return Integer.parseInt(numStr[0]) + Integer.parseInt(numStr[1]);
        if(binomial.contains("-")) return Integer.parseInt(numStr[0]) - Integer.parseInt(numStr[1]);
        if(binomial.contains("*")) return Integer.parseInt(numStr[0]) * Integer.parseInt(numStr[1]);
        
        int answer = 0;
        return answer;
    }
}