import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            long num = 1;
            int digits = 1;

            while (true) {
                if (num % n ==0){
                    System.out.println(digits);
                    break;
                }

                num = (num * 10 + 1) % n;
                digits++;
            }
        }


    }

}