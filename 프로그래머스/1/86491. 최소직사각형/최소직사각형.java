import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        // 왼쪽에 큰 값으로 정렬
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        // 가장 큰 왼쪽 값 가져오기
        int left = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > left) left = sizes[i][0];
        }        
        
        // 가장 큰 오른쪽 값 가져오기
        int right = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][1] > right) right = sizes[i][1];
        }     
        
       return left*right;
    }
}