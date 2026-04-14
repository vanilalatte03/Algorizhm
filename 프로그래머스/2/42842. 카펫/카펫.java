import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        //1. 전체 칸 수 = brown + yellow
        int all = brown + yellow;
        //2. 전체 칸 수의 약수쌍을 구한다
        for (int i = 1; i <= Math.sqrt(all); i++) {
            if(all % i == 0) {
                int height = i;
                int width = all / i;
                
                //3. 가로 >= 세로 조건으로 본다
                //4. (가로 - 2) * (세로 - 2) == yellow
                if ((width - 2) * (height - 2) == yellow) {
                    answer = new int[]{width, height};
                    break;
                }  
            }
        }

        return answer;
    }
}

