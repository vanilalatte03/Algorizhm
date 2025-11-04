import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[N.length()];
        for (int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i) - '0';
        }


        for(int i = 0; i < N.length(); i++){
            int Max =  i;
            for(int j = i+1; j < N.length(); j++){
                if(arr[j] > arr[Max]){
                    Max = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[Max];
                arr[Max] = temp;

        }

        for (int var : arr){
            System.out.print(var);
        }
    }
}