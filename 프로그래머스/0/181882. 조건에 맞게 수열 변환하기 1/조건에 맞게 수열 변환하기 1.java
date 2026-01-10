class Solution {
    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            int input = arr[i];
            if(arr[i]>=50 && arr[i]%2 == 0){
                input/=2;
            }
            else if(arr[i]<50 && arr[i]% 2 == 1){
                input*=2;
            }
            answer[i] = input;
        }
        return answer;
    }
}