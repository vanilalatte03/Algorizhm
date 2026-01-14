import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int select = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums) set.add(n);
        
        return Math.min(set.size(), select);
    }
}