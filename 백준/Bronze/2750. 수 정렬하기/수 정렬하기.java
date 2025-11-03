import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < num-1; i++){
            for(int j = 1; j < num-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println(arr[i]);
        }

    }
}