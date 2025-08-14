import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       //번호로 이름을 찾기 위한 배열
       String[] numToName = new String[N+1];

       //이름으로 번호를 찾기 위한 해시맵
       HashMap<String, Integer> nameToNumMap = new HashMap<>();

       for (int i = 1; i <= N; i++){
           String pokemon = br.readLine();
           nameToNumMap.put(pokemon, i);
           numToName[i] = pokemon;
       }

       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < M; i++){
           String result = br.readLine();
           try {
               int num = Integer.parseInt(result);
               sb.append(numToName[num]).append("\n");
           } catch (NumberFormatException e){
               sb.append(nameToNumMap.get(result)).append("\n");
           }
       }
        System.out.print(sb.toString());
    }
}