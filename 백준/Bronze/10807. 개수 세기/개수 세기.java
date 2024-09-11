import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        int N = Integer.parseInt(br.readLine()); 
        
        String[] inputs = br.readLine().split(" ");
        
        int v = Integer.parseInt(br.readLine());
        
        // inputs 배열을 순회하면서 v와 같은 값을 찾음
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(inputs[i]) == v) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
