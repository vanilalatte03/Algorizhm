import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int currentNum = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            currentNum = citations[i];
            if(currentNum >= citations.length-i){
                return citations.length-i;
            }
        }
            
        return 0;
    }
}
