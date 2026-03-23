import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();

        int firstEndDay = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int bundle = 1;

        for (int i = 1; i < progresses.length; i++) {
            int endDay = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (endDay <= firstEndDay) {
                bundle++;
            } else {
                list.add(bundle);
                firstEndDay = endDay;
                bundle = 1;
            }
        }

        list.add(bundle);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}