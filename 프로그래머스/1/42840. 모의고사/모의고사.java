import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        //1. 각 학생별로 패턴 배열 생성
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //2. 맞은 정답 수 저장
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == student1[i % student1.length]) {
                scores[0]++;
            }
             if(answers[i] == student2[i % student2.length]) { 
                scores[1]++;
            }
             if(answers[i] == student3[i % student3.length]) {
                scores[2]++;
            }
        }
        
        //3. 가장 높은 점수 max에 저장
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        //4. max값이랑 같은 학생 전부 리스트에 담기
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                result.add(i + 1);
            }
        }
        
        //5. 배열에 정답인 학생 담아서 반환
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}