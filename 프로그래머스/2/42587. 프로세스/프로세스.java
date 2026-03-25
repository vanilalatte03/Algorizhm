import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            int[] process = {priorities[i], i};
            q.offer(process);
        }
        
        int count = 0;
        
        while(!q.isEmpty()){
            int[] first = q.poll();
            boolean hasHigher = false;
            
            for(int[] process : q){
                if(process[0] > first[0]){
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher) {
                q.offer(first);
            } else {
                count++;
                if(first[1] == location){
                    return count;
                }
            }
        }
        return count; 
        
    }
}