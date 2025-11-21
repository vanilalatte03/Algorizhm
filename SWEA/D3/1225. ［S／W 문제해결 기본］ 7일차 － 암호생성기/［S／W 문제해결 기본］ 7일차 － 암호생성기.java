
import java.util.*;
import java.io.*;

class Solution
{
	static int[] nums;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++) {
			int testNum = Integer.parseInt(br.readLine());
			Queue<Integer> queue = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < 8; i++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			
			int minus = 1;
			
			while(true) {
				int num = queue.poll() - minus;
				if(num <= 0) {
					num = 0;
					queue.offer(num);
					break;
				}
				queue.offer(num);
				
				minus++;
				
				if(minus > 5) {
					minus =1;
				}
			}
			
			
			System.out.print("#" + testNum);
			for(int i = 0; i < 8; i++) {
				System.out.print(" " + queue.poll());
			}
			System.out.println();
			
		}
	}
}