import java.util.*;
import java.io.*;

public class Main{
    static int[][] paper;
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(br.readLine());
       paper = new int[100][100];
       int count = 0;
       for(int i = 0; i < num; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());
           swap(x, y);
       }

        for (int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++){
                if(paper[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void swap(int x, int y){
        for(int i = x; i < x+10; i++){
            for(int j = y; j < y+10; j++){
                if(i < 100 && j < 100){
                    paper[i][j] = 1;
                }
            }
        }
    }

}

