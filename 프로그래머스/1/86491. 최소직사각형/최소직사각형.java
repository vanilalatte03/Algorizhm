import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        
        return maxW * maxH;
    }
}

//1. 큰값을 가로, 작은값을 세로로 정렬한다.
//2. 세로, 가로 각각 정렬된 값중 가장 큰값을 찾는다.
//3. 두 값을 곱해서 리턴한다.