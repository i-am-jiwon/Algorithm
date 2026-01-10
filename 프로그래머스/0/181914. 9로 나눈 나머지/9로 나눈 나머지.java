import java.util.*;

class Solution {
    public int solution(String number) {
        
    int sum1 = number.chars()
        .map(c -> c - '0')
        .sum();
    return sum1 % 9;
        
    }
}