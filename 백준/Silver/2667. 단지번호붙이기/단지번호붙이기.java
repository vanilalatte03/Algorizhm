import java.util.*;

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> list;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];
        list =  new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    list.add(bfs(i, j));
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int a : list){
            System.out.println(a);
        }

    }

    public static int bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY));
        visited[startX][startY] = true;
        int currentSize = 1;
        
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int currentX = current.x;
            int currentY = current.y;

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];


                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }
                if (visited[nextX][nextY]) {
                    continue;
                }

                if (map[nextX][nextY] == 1) {
                    queue.add(new Point(nextX, nextY));
                    visited[nextX][nextY] = true;
                    currentSize++;
                }
            }
        }
        return currentSize;
    }
}