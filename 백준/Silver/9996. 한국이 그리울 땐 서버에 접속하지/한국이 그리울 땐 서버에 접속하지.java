import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(br.readLine());
       String pt = br.readLine();

       String[] pArr = pt.split("\\*");
       String front = pArr[0];
       String end = pArr[1];

       for (int i=0; i < num; i++){
           String fileName = br.readLine();
           if (front.length() + end.length() > fileName.length()){
               System.out.println("NE");
           } else {
               if (fileName.startsWith(front) && fileName.endsWith(end)){
                   System.out.println("DA");
               } else {
                   System.out.println("NE");
               }
           }
       }
    }
}