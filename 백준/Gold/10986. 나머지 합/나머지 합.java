import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] remainder = new long[M];
        long sum = 0;
        long count = 0;
        
        st = new StringTokenizer(br.readLine());
       
        // S[0] = 0 의 나머지 0을 미리 포함
        remainder[0] = 1;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken());
            int mod = (int)(sum % M);
            count += remainder[mod];
            remainder[mod]++;
        }

        System.out.print(count);
        
    }
}