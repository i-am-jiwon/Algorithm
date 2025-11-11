import java.util.*;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int[] sliceArr = Arrays.copyOfRange(arr, idx, arr.length);
        
        int count = 0;
        for (int num : sliceArr){
            if (num == 1) return count + idx;
            
            count++;
        }
        return -1;
    }
}