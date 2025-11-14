import java.util.*;
import java.io.*;

public class Main{
    static int[][] stage;
    static int binggo, count;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       stage = new int[5][5];
       binggo = 0;
       count = 0;

       for(int i = 0; i < 5; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j = 0; j < 5; j++){
               stage[i][j] = Integer.parseInt(st.nextToken());
           }
       }

       for(int i = 0; i < 5; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j = 0; j < 5; j++){
               int num = Integer.parseInt(st.nextToken());
               count++;

               findMark(num);

               checkBingo();
               if (binggo >= 3) {
                   System.out.println(count);
                   return; 
               }
           }


       }

    }

    public static void findMark(int num){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                if (stage[i][j] == num) {
                    stage[i][j] = 0;
                    return;
                }
            }
        }
    }

    public static void checkBingo(){
        binggo = 0;
        int rowCheck, colCheck;

        for (int i = 0; i < 5; i++) {
            rowCheck = 0;
            colCheck = 0;
            for (int j = 0; j < 5; j++) {
                if (stage[i][j] == 0) rowCheck++;
                if (stage[j][i] == 0) colCheck++;
            }
            if (rowCheck == 5) binggo++;
            if (colCheck == 5) binggo++;
        }

        int diagCheck1 = 0; // 정대각선 \
        int diagCheck2 = 0; // 역대각선 /

        for (int i = 0; i < 5; i++) {
            if (stage[i][i] == 0) diagCheck1++;
            if (stage[i][4 - i] == 0) diagCheck2++;
        }
        if (diagCheck1 == 5) binggo++;
        if (diagCheck2 == 5) binggo++;
    }
}

