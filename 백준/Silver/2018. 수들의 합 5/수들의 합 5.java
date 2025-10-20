import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;

        while (end_index != num){
            if(sum == num){
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > num){
                sum -= start_index;
                start_index++;
            } else if (sum < num){
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);


    }
}