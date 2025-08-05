import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();

       StringBuilder result = new StringBuilder();

       for (int i = 0; i < input.length(); i++){
           char ch = input.charAt(i);

           if (ch >= 'A' && ch <= 'Z'){
               ch = (char) (ch > 'M' ? ch - 13 : ch + 13);
           } else if ( ch >= 'a' && ch <= 'z'){
               ch = (char) (ch > 'm' ? ch - 13 : ch + 13);
           }

           result.append(ch);
       }

        System.out.print(result);

    }
}