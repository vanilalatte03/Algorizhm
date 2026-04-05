import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());
        int prize = Integer.parseInt(st.nextToken());
        Integer[] scores = new Integer[people];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < people; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println(scores[prize-1]);
        
    }
}

