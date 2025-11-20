import java.util.*;
import java.io.*;

class Solution
{

	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++)
		{
	
			int length = Integer.parseInt(br.readLine());
			int[][] map = new int[100][100];
			int count = 0;
			
			for(int i = 0;  i < length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j <length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int j =0; j < length; j++){
				boolean isOneTrue = false;
				for(int i = 0; i < length; i++) {
					if(map[i][j] == 1) {
						isOneTrue = true;
					} else if(map[i][j] == 2) {
						if(isOneTrue) {
							count++;
							isOneTrue = false;
						}
					}
				}
			}
		
			System.out.println("#" + test_case + " "+count);
			
		}
		
	}
}