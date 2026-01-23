class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for(int i : array){
            count[i]++;
        }
        
        int maxCount = 0;
        int answer = 0;
        
        for(int i =0; i < count.length; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                answer = i;
            } else if (count[i] == maxCount){
                answer = -1;
            }
        }
        
        return answer;
    }
}