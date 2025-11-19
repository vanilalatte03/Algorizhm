
import java.util.*;

class Solution
{
	static int N, M, longPath;
	static int[][] map;
	static boolean[] visited;
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			
			map = new int[N+1][N+1];
			visited = new boolean[N+1];
			
			longPath = 0;
			for(int i = 0; i < M; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = 1;
				map[y][x] = 1;
			}

			for(int i = 0; i<=N; i++) {
				dfs(i, 1);
			}
			
			System.out.println("#" + test_case + " " + longPath);
		}
	}
	
	public static void dfs(int current, int length) {
		if(length > longPath) {
			longPath = length;
		}
		
		visited[current] = true;
		
		for(int next = 1; next <= N; next++) {
			if(map[current][next] ==1 && visited[next] == false) {
				dfs(next, length+1);
			}
		}
		
		visited[current] = false;
		
		
	}
}