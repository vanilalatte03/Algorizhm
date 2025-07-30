import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i <9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int spy1 =0 , spy2 = 0;
        for (int i = 0; i < 9; i++){
            for (int j = i+1; j < 9; j++){
                if (sum - arr[i] - arr[j] == 100){
                    spy1 = arr[i];
                    spy2 = arr[j];
                    break;
                }
            }
            if (spy1 != 0) break;
        }

        Arrays.sort(arr);

        for (int num : arr){
            if (num != spy1 && num != spy2){
                System.out.println(num);
            }
        }

    }
}