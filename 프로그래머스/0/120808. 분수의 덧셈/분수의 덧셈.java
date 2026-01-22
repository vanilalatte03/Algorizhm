class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bottem = denom1 * denom2;
        int top = numer1 * denom2 + numer2 * denom1;
        int gcdValue = gcd(top, bottem);   
        return new int[] {top/gcdValue, bottem/gcdValue};
    }
    
    private int gcd(int a, int b){
        if(b == 0){
            return a;
        } 
        return gcd(b, a % b);
    }
}