import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<Integer>();
    boolean[] visited;
     
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        
        dfs(numbers, "");
       
        int answer = 0;
        
        for(int num : set){
            if(isPrame(num)){
                answer++;
            }    
        }
        
        return answer;
    }
    
    public void dfs(String numbers, String current) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i));
                visited[i] = false;
            }
        } 
    }
    
    public boolean isPrame(int num) {
        if(num < 2) return false;
        if (num == 2) return true;
        if(num % 2 == 0) return false;
        
        for(int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
