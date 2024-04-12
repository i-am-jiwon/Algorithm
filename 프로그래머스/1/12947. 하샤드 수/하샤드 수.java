import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public boolean solution(int x) {

        /*
            IntStream 활용 <자릿수 더하기>
        */
        int sum = IntStream.iterate(x, i-> i > 0, i-> i/10)
            .map(i -> i%10)
            .sum();
        
        
        return x % sum == 0? true:false;
    }
}