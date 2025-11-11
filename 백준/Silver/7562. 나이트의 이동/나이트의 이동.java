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
    static int T, I, N, M, fN, fM;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int i = 0; i < T; i++){
            I = sc.nextInt();
            map = new int[I][I];
            visited = new boolean[I][I];

            for(int j = 0; j < I; j++){
                for(int k = 0; k < I; k++){
                    map[j][k] = 0;
                }
            }

            N = sc.nextInt();
            M = sc.nextInt();
            fN = sc.nextInt();
            fM = sc.nextInt();

            if(N == fN && M == fM){
                System.out.println(map[fN][fM]);
            } else {
                bfs(N, M);
                System.out.println(map[fN][fM]);
            }


        }
    }

    public static void bfs(int startX, int startY){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX,startY));
        visited[startX][startY] = true;

        while(!queue.isEmpty()){
            Point current = queue.poll();
            int currentX = current.x;
            int currentY = current.y;
            for(int i = 0 ; i < 8; i++){
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= I || nextY >= I){
                    continue;
                }

                if(!visited[nextX][nextY]){
                    queue.add(new Point(nextX,nextY));
                    visited[nextX][nextY] = true;
                    map[nextX][nextY] = map[currentX][currentY] + 1;
                }
            }
        }
    }
}