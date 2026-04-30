import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> left = new HashSet<>();
        Map<Integer, Integer> right = new HashMap<>();
        
        //1. 모든 토핑을 오른쪽에 배치
        for(int num : topping) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }
        
        //2. 왼쪽으로 하나씩 옮기면서 확인
        for(int i = 0; i < topping.length - 1; i++) {
            int num = topping[i];
            
            
            left.add(num);
            
            
            right.put(num, right.get(num) - 1);
            
            // 오른쪽에 해당 종류가 없으면 제거
            if(right.get(num) == 0) {
                right.remove(num);
            }
            
            if(left.size() == right.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}