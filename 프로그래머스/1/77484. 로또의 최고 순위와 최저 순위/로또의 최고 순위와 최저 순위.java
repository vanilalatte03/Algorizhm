class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {        
        int zeroCount = 0;
        int matchCount = 0;
        
        for(int num : lottos) {
            if(num == 0) {
                zeroCount++;
                continue;
            }
            
            for(int j = 0; j < 6; j++) {
                if(num == win_nums[j]){
                    matchCount++;
                    break;
                }
            }
        }
        
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int best = matchCount + zeroCount;
        int worst = matchCount;
        
        return new int[]{rank[best], rank[worst]};
    }
}