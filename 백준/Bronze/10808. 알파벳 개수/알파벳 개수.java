import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int result = 0;

        String str = br.readLine();
        String[] arr2 = str.split("");
        for(int i = 0; i < arr2.length; i++){
            result = arr2[i].charAt(0) - 'a';
            arr[result]++;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}