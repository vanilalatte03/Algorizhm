import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {        
        Deque<Integer> bridge = new ArrayDeque<>();
        
         for (int i = 0; i < bridge_length; i++) {
            bridge.offerLast(0);
        }
        
        int time = 0;
        int currentWeight = 0;
        int truckIndex = 0;
        
        while (truckIndex < truck_weights.length) {
            time++;

            currentWeight -= bridge.pollFirst();

            if (currentWeight + truck_weights[truckIndex] <= weight) {
                bridge.offerLast(truck_weights[truckIndex]);
                currentWeight += truck_weights[truckIndex];
                truckIndex++;
            } else {
                bridge.offerLast(0);
            }
        }

        return time + bridge_length;
        
    }
}