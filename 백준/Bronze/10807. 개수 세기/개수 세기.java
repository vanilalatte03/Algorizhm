import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        // 정수의 개수 입력
        int N = Integer.parseInt(br.readLine()); 
        
        // N개의 정수를 공백으로 구분하여 입력받음
        String[] inputs = br.readLine().split(" ");
        
        // 찾으려는 정수 v 입력
        int v = Integer.parseInt(br.readLine());
        
        // inputs 배열을 순회하면서 v와 같은 값을 찾음
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(inputs[i]) == v) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}
