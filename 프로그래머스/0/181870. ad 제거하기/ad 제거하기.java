import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        
        List<String> arrayList = new ArrayList<>();
        
        for( int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")) arrayList.add(strArr[i]);
        }
        String[] answer = new String[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}