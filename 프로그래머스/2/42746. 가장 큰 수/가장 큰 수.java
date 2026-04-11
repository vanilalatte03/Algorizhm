import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArray = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strArray, (a, b) -> (b + a).compareTo(a + b));
        
        if (strArray[0].equals("0")) {
                return "0";
            }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < strArray.length; i++) {
            answer.append(strArray[i]);
        }
        
        return answer.toString();
    }
}

//1. int[] -> String[] 로 변환
//2. Arrays.sort(문자열배열, (a, b) -> (b+a).compareTo(a+b));
//3. 맨 앞이 "0"이면 "0" 리턴
//4. 전부 이어붙여서 리턴
