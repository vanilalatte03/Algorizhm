import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long max = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());

            if(max < score){
                max = score;
            }

            sum += score;
        }
        
        System.out.println(sum * 100.0 / max / N);

    }
}