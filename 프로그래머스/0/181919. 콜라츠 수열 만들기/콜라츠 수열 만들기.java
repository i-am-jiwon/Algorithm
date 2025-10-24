import java.util.*;

class Solution {
    public int[] solution(int n) {
        
    List<Integer> numList = new ArrayList<>();
        
        while(n != 1){
                        
            numList.add(n);
            if(n%2 == 0) n = n/2;
            else n = 3*n+1;


            
        }
                    numList.add(1);

        int[] result = numList.stream().mapToInt(i->i).toArray();
        return result;
    }
}