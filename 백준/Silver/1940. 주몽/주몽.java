import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        Integer M = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int count = 0;
        int start = 0;
        int end = N-1;

        //투 포인터 알고리즘
        while (start < end){
            int sum = num[start] + num[end];

            if(sum > M) {
                end--;
            } else if(sum < M){
                start++;
            } else {
                count++;
                start++;
                end--;
            }
        }


        System.out.println(count);
    }

}