import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count = 0;
        
        for (int i : scoville) {
            pq.offer(i);
        }
        
        while (pq.size() >= 2) {
            if (pq.peek() >= K) {
                return count;
            }
            int first = pq.poll();
            int second = pq.poll();
            
            pq.offer(first + (second * 2));
            
            count++;
        }
        
        return pq.peek() >= K ? count : -1;
    }
}