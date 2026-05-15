class Solution {
    public int solution(int storey) {
        int answer = 0;

        //1. 낮은 자리부터 하나씩 0으로
        while (storey > 0) {
            int digit = storey % 10;             
            int nextDigit = (storey / 10) % 10;  

            if (digit < 5) {
                //2. 0에 더 가까우면 현재 자리만 내려서 제거
                answer += digit;
            } else if (digit > 5) {
                //3. 10에 더 가까우면 올림 처리
                answer += 10 - digit;
                storey += 10;
            } else {
                //4. 5는 내림/올림 비용이 같으므로 다음 자리로 판단
                answer += 5;

                if (nextDigit >= 5) {
                    //5. 다음 자리도 크면 같이 올리는 쪽이 유리
                    storey += 10;
                }
            }

            //6. 처리한 현재 자리는 제거하고 다음 자리로 이동
            storey /= 10;
        }

        return answer;
    }
}