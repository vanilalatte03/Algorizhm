import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] state = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){
            state[i] = Integer.parseInt(st.nextToken());
        }

        int S = Integer.parseInt(br.readLine());
        for(int i = 0; i < S; i++){
           st = new StringTokenizer(br.readLine());
           int gender = Integer.parseInt(st.nextToken());
           int num = Integer.parseInt(st.nextToken());

           switch(gender){
               case 1:
                  for(int j = num; j < N+1; j += num){
                          toggle(state, j);
                  }
                  break;

               case 2:
                   toggle(state, num);
                   int left = num-1;
                   int right = num+1;
                   while(left >= 1 && right <= N && state[left] == state[right]){
                       toggle(state, left);
                       toggle(state, right);

                       left--;
                       right++;
                   }
                   break;
           }
        }

        for(int i = 1; i < state.length; i++){
            System.out.print(state[i] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }

    }

    public static void toggle(int[] arr, int index){
        arr[index] = arr[index] > 0 ? 0 : 1;
    }
}