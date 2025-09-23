class Solution {
    public int solution(String before, String after) {

        for(int i =0; i < before.length(); i++){
            for(int j =0; j < after.length(); j++){
               if( before.charAt(i) == after.charAt(j) ) {
                   after = after.substring(0, j) + after.substring(j+1, after.length());
                   break;
               }
            }
        }
        if(after.length() != 0) return 0;
        return 1;
    }
}