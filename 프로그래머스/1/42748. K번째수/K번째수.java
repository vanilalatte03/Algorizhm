import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}


//1. 원본 배열을 복사해서 원하는 범위만큼 자른다.
//2. 복사한 배열을 정렬한다.
//3. command n번째 수를 answer 배열에 담는다.