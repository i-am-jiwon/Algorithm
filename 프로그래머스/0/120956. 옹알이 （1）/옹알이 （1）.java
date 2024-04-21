class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        System.out.println(babbling[0]);
        System.out.println(babbling.length);
        
        for(int i = 0; i < babbling.length; i++){
            babbling[i]= babbling[i].replace("aya", " ");
            babbling[i]= babbling[i].replace("ye", " ");
            babbling[i]= babbling[i].replace("woo", " ");
            babbling[i]= babbling[i].replace("ma", " ");
            
            if(babbling[i].trim().length() == 0) answer++;
            System.out.println(babbling[i].trim().length());

        }
        
        return answer;
    }
}