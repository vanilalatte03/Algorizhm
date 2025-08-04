import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine();

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        String rv = sb.toString();

        if (original.equals(rv)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
