import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int day = Integer.parseInt(st.nextToken());
       int seq = Integer.parseInt(st.nextToken());
       int[] temps = new int[day];

       st = new StringTokenizer(br.readLine());
       for (int i = 0; i < day; i++){
           temps[i] = Integer.parseInt(st.nextToken());
       }

       int cSum = 0;
       for (int i = 0; i < seq; i++){
           cSum += temps[i];
       }

       int maxSum = cSum;
       for(int i = seq; i < day; i++){
           cSum = cSum - temps[i - seq] + temps[i];

           maxSum = Math.max(cSum, maxSum);
       }

        System.out.println(maxSum);

    }
}