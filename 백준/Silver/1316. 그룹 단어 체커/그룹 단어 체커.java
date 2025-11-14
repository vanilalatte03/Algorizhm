import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;
            visited[str.charAt(0) - 'a'] = true;

            for(int j = 1; j < str.length(); j++){
                int current = str.charAt(j) - 'a';
                int back = str.charAt(j-1) - 'a';

                if(current != back){
                    if(!visited[current]){
                        visited[current] = true;
                    } else {
                        isGroupWord = false;
                        break;
                    }
                }
            }

            if(isGroupWord){
                count++;
            }

        }
        
        System.out.println(count);
    }
}

