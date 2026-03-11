class Solution {
    public int solution(int a, int b) {
        int n1 = Integer.parseInt(""+a+b);
        int n2 = 2 * a * b;
        
        return Math.max(n1, n2);
    }
}