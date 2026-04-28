class Solution {
    public int solution(int[] arr) {
        int currentNum = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            int nextNum = arr[i];
            
            int candidate = currentNum;
            
            while(candidate % nextNum != 0) {
                candidate += currentNum;
            } 
            
            currentNum = candidate;
            
        }
            
        return currentNum;
            
    }
}