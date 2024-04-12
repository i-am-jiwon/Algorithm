import java.util.*;
import java.util.stream.IntStream;



public class Solution {
    public int solution(int n) {
        return IntStream.iterate(n, i -> i / 10)
            .takeWhile(i -> i > 0)
            .map(i -> i % 10)
            .sum();
    }
}