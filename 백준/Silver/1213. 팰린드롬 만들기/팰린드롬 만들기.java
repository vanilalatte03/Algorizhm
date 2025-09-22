import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        //알파벳 갯수 새기
        int[] counts = new int[26];
        for (int i =0; i < name.length(); i++){
            counts[name.charAt(i)-'A']++;
        }


        int oddCount = 0;
        char middleChar = ' ';
        for (int i = 0; i < 26; i++){
            if (counts[i] % 2 != 0) {
                oddCount++;
                middleChar = (char) ('A' + i);
            }
        }

        //불가능한 경우
        if (oddCount  > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++){
            for (int j = 0; j <counts[i] / 2; j++){
                sb.append((char) ('A' + i));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(sb);

        if (oddCount == 1 ){
            result.append(middleChar);
        }

        result.append(sb.reverse());

        System.out.println(result.toString());



    }
}