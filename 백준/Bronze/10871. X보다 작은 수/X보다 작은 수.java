import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
        String[] NX = br.readLine().split(" ");
        int N = Integer.parseInt(NX[0]);
        int X = Integer.parseInt(NX[1]);
        
        String[] A = br.readLine().split(" ");
        
        for(int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(A[i]);
            
            if(num < X){
                bw.write(num + " ");
            }          
            
        }        
        bw.flush();
        bw.close();
        br.close();
    }
}