import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {

    int count = 0;
        for(boolean fin : finished){
            if(!fin){
                count++;
            }
        }
        
        
        
        
        String[] answer = new String[count];
        
        int index = 0;
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer[index] = todo_list[i];
                index++;
            }
        }
        
        return answer;
    }
}