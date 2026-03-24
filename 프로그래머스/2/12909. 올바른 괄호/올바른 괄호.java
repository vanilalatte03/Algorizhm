import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else if(s.charAt(i) == ')'){
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}

// (이면 스택 추가 )이면 스택 감소
// 스택이 0이면 true 아니면 false