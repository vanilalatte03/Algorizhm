import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(cal(A, B, C));
    }

    public static long cal(long a, long b, long c){

        if (b == 1) {
            return a % c;
        }

        long temp = cal(a, b / 2, c);

        long result = (temp * temp) % c;
                
        if (b % 2 == 1){
            result = (result * a) % c;
        }
        return result;
    }
}