class Solution {
    public int answer;
    public boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
    
        visited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons);
    
        return answer;
    }
    
    
    private void dfs(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        
        answer = answer > depth ? answer : depth;
    }
    
    
    
    
    
    
    
    
    private int tiredCount(int k, int[][] dungeons){
        int count = 0;
        int tired = k;
        for(int i = 0; i < dungeons.length; i++ ){
            System.out.print("tired = " + tired +" minT = " + dungeons[i][0] + "/" + dungeons[i][1]);
            
            if(dungeons[i][0] < tired){
                tired -= dungeons[i][1];
                count++;
            } 
        }
        System.out.println();
        System.out.println(count);
        
        return count;
    }
    
}