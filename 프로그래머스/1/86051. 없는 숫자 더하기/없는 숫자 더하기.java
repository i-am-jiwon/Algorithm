import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        
        
        
        int answer = 45 - IntStream.of(numbers).sum(); 
        return answer;
    }
}