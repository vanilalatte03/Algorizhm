import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                queue.add(arr[i]);
            }
        }
        
        int[] answer = new int[queue.size()];
        
        int i = 0;
        while(!queue.isEmpty()){
            answer[i] = queue.poll();
            i++;
        }

        return answer;
    }
}