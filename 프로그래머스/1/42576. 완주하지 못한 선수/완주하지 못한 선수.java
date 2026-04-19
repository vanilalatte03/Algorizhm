import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return entry.getKey();
            }
        }

        return "";
    }
}

//1. 참가자 배열을 돌면서 +1
//2. 완주자 배열을 돌면서 -1
//3. map을 순회하면서 value가 0이 아니면 그 이름이 완주하지 못한 선수