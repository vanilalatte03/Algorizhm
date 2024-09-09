import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       while(true) {
           String[] s = br.readLine().split(" ");
           int a = Integer.parseInt(s[0]);
           int b = Integer.parseInt(s[1]);
           if (a==0 && b==0) break;
           bw.write(a+b+"\n");
       } 
       bw.flush();
       bw.close();
       
    }
}