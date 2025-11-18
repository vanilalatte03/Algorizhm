
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] boxs = new int[100];
			for(int i = 0;  i < 100; i++) {
				boxs[i] = sc.nextInt();
			}
			
			for(int i =0; i < N; i++) {
				Arrays.sort(boxs);
				
				if(boxs[99]-boxs[0] <= 1) {
					break;
				}
				boxs[99]--;
				boxs[0]++;
			}
			
			Arrays.sort(boxs);
			int result = boxs[99] - boxs[0];
			
			System.out.println("#" + test_case+ " " + result);

		}
	}
}