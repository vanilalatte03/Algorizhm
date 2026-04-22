import java.util.*;

class Solution {
    public int solution(int[] order) { 
        //1. 보조 컨테이너 벨트 생성 
        Deque<Integer> stack = new ArrayDeque<>();  
             
        //2. 
        int result = 0;
        int currentTarget = 0; 
        
        for(int i = 1; i <= order.length; i++) {
            if(i == order[currentTarget]) {
                result++;
                currentTarget++;
            } else {
                stack.push(i);
            }
            
            while(!stack.isEmpty()) {
                if(order[currentTarget] == stack.peek()) {
                    stack.pop();
                    result++;
                    currentTarget++;
                } else {
                    break;
                }
            }
        
        }
        return result;
    }
}