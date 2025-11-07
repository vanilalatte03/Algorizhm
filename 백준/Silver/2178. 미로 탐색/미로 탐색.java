import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;

    //방향 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String str = sc.next();
            for(int j = 0; j < M; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(map[N-1][M-1]);

    }

    public static void bfs(int X, int Y){
        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(X, Y));

        visited[X][Y] = true;

        while(!queue.isEmpty()){
            Point current = queue.poll();
            int currentX = current.x;
            int currentY = current.y;

            for(int i = 0; i < 4; i++){
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M){
                    continue;
                }

                if(visited[nextX][nextY]){
                    continue;
                }

                if(map[nextX][nextY] == 1){
                    queue.add(new Point(nextX, nextY));
                    visited[nextX][nextY] = true;

                    map[nextX][nextY] = map[currentX][currentY] + 1;
                }
            }

        }

    }
}