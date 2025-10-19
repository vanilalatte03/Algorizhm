import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] S = new int[num + 1];

        for (int i = 1; i < num+1; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < question; i++){
            st = new StringTokenizer(br.readLine());
            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            sb.append(S[N2] - S[N1-1]).append("\n");
        }
        System.out.println(sb);
    }
}