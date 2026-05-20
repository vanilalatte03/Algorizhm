import java.util.*;

class Solution {

    static class Truck {
        int weight;
        int exitTime;

        Truck(int weight, int exitTime) {
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new ArrayDeque<>();

        int time = 0;
        int currentWeight = 0;
        int truckIndex = 0;

        while (truckIndex < truck_weights.length || !bridge.isEmpty()) {
            time++;

            // 현재 시간에 다리를 빠져나갈 트럭 제거
            if (!bridge.isEmpty() && bridge.peek().exitTime == time) {
                currentWeight -= bridge.poll().weight;
            }

            // 다음 트럭을 올릴 수 있으면 올림
            if (truckIndex < truck_weights.length
                    && currentWeight + truck_weights[truckIndex] <= weight) {

                int truckWeight = truck_weights[truckIndex];

                bridge.offer(new Truck(truckWeight, time + bridge_length));
                currentWeight += truckWeight;
                truckIndex++;
            }
        }

        return time;
    }
}