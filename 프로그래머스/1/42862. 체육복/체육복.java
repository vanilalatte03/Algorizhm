class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        //1. 학생수만큼 값이 전부 1인 배열 생성
        for(int i = 0; i < n; i++) {
            student[i] = 1;
        }
        
        // 2. lost 학생은 -1 처리
        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1]--;
        }

        // 3. reserve 학생은 +1 처리
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1]++;
        }

        // 4. 체육복이 없는 학생(0)을 만나면 앞/뒤 학생에게 빌릴 수 있는지 확인
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
        
        // 5. 마지막에 체육복이 1개 이상 있는 학생 수 반환
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (student[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}