import java.util.*;

public class Main{
    static int N, K;
    static int[] time;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        if (N == K) {
            System.out.println(0);
        } else {
            time = new int[100001];
            visited = new boolean[100001];
            bfs(N);
            System.out.println(time[K]);
        }
    }

    public static void bfs(int StartPos){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(StartPos);
        visited[StartPos] = true;

        while(!queue.isEmpty()){
            int currentPos = queue.poll();

            if(currentPos == K){
                continue;
            }

            int next1 = currentPos - 1;
            if (next1 >= 0 && !visited[next1]) {
                queue.add(next1);
                visited[next1] = true;
                time[next1] = time[currentPos] + 1;
            }

            int next2 = currentPos + 1;
            if (next2 <= 100000 && !visited[next2]) {
                queue.add(next2);
                visited[next2] = true;
                time[next2] = time[currentPos] + 1;
            }

            int next3 = currentPos * 2;
            if (next3 <= 100000 && !visited[next3]) {
                queue.add(next3);
                visited[next3] = true;
                time[next3] = time[currentPos] + 1;
            }

        }

    }
}