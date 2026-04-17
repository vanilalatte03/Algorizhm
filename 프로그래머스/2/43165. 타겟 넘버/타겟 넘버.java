import java.util.*;

class Solution {
    static int target = 0;
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        Solution.target = target;
        
        dfs(numbers,0,0);
        
        return count;
    }
    
    public void dfs(int[] numbers,int index, int currentSum) {
        if(index == numbers.length){
            if(currentSum == target){
                count++;
                return;
            }  
            return;
        }
        
        dfs(numbers, index+1, currentSum + numbers[index]);
        dfs(numbers, index+1, currentSum - numbers[index]);
        return;
    }
    
}



//number에서 -,+ 두 방향으로 dfs로 뻗어나가면서 마지막 숫자에 도달하면 타켓 넘버와 비교한다.