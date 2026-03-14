class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String s = ineq + eq;
        
        if(s.equals(">=")){
            return n >=m ? 1 : 0;
        } else if(s.equals("<=")){
            return n <=m ? 1 : 0;
        }else if(s.equals("<!")){
            return n < m ? 1 : 0;
        } else {
              return n > m ? 1 : 0;
        }
        
    
    }
}