import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 0;
        for(int i = 0 ; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                arr.add(count);
                count = 0;
            }
            else{count ++;}
        }
        arr.add(count);
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}