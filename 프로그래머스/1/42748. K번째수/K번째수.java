import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        return IntStream.range(0,commands.length)
            .map (i-> Arrays.stream(array)
                .skip(commands[i][0]-1)
                .limit(commands[i][1]-commands[i][0]+1)
                .sorted()
                .toArray()[commands[i][2]-1])
            .toArray();
    }
}