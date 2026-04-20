class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        //1. 학생수만큼 값이 전부 1인 배열 생성
        for(int i = 0; i < n; i++) {
            student[i] = 1;
        }
        
        // 2. 도난 처리
        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1]--;
        }

        // 3. 여벌 처리
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1]++;
        }
        
        //4. 빌려주기
        for (int i = 0; i < n; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) {
                    student[i - 1]--;
                    student[i]++;
                } else if (i < n - 1 && student[i + 1] == 2) {
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }
        
        // 5. 수업 들을 수 있는 학생 수 세기
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (student[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}