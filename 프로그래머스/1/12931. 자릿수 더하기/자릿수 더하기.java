import java.util.*;
import java.util.stream.IntStream;



public class Solution {
    public int solution(int n) {
        /*
            IntStream을 활용한 풀이
            각 자리 수의 합을 위해 10으로 나눠서 10 보다 크면 총 합에 추가하기
        */
        
        //iterate로 n을 10으로 나누기
        return IntStream.iterate(n, i -> i > 0, i -> i / 10)
            // 
            .map(i -> i % 10)
            .sum();
    }
}