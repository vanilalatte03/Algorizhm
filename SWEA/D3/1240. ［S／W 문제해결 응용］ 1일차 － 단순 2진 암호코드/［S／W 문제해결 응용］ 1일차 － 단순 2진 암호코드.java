
import java.util.*;
import java.io.*;


class Solution
{
	static String[] bit = {
	"0001101", "0011001","0010011","0111101",
	"0100011", "0110001","0101111","0111011",
	"0110111", "0001011"
	};
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 세로
            int M = Integer.parseInt(st.nextToken());
            String[] map = new String[N];
        	String codeLine = "";
           
            
            //암호문 줄 찾기
            for(int i = 0; i<N; i++){
            	map[i] = br.readLine();
            	if(map[i].contains("1")) {
            		codeLine = map[i];
            	}
            }
            // 1찾기
            int endIndex = 0;
            for(int i = M-1; i >=0; i--) {
            	if(codeLine.charAt(i) == '1') {
            		endIndex = i;
            		break;
            	}
            }
            //56글자 잘라내기
            String code = codeLine.substring(endIndex -55, endIndex+1);
            
            int[] number = new int[8];
            for(int i =0; i < 8; i++) {
            	String sub = code.substring(i * 7, (i + 1) * 7);
            	number[i] = decode(sub);
            }
            
            int sum1 = number[0] + number[2] + number[4] + number[6];
            int sum2 = number[1] + number[3] + number[5] + number[7];
            
            int sum = (sum1 * 3) + sum2;
            
            if(sum % 10 == 0) {
            	System.out.println("#" + test_case +" "+(sum1 + sum2));
            } else {
            	System.out.println("#" + test_case +" "+0);
            }
            
		}
	}
	private static int decode(String sub) {
		for(int i = 0; i < 10; i++) {
			if(bit[i].equals(sub)) {
				return i;
			}
		}
		return -1;
	}
}