import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        Arrays.sort(nums);
        int avg = sum / nums.length;

        System.out.println(avg);
        System.out.println(nums[2]);

    }
}

