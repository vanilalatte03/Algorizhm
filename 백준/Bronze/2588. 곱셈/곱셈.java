import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int A = num1 * (num2%10);
        int B = num1 * ((num2/10) % 10);
        int C = num1 * (num2/100);

        System.out.println(A + "\n" + B + "\n" + C + "\n" + num1 * num2);
    }
}