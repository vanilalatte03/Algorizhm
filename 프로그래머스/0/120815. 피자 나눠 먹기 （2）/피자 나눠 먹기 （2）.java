class Solution {
    public int solution(int n) {
        int num = n;
        while(num%6 != 0){
            num += n;
        }
        int pizza = num / 6;
        
        return pizza;
    }
}