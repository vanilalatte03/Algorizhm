import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());

            if(max < score){
                max = score;
            }

            sum += score;
        }

        double newAvg = (sum * 100) / max / N;

        System.out.println(newAvg);

    }
}