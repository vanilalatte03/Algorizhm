import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] S = new int[N+1][N+1];
        int M = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++){
                S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1]  + S[x1 - 1][y1 - 1]).append('\n');
        }

        System.out.println(sb);

    }
}