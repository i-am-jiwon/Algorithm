import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        for(int num : arr){
            for(int i = 0; i < num; i++){
                arr2.add(num);
            }
        }
        int[] answer = arr2.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}