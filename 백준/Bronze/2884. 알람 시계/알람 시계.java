import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H == 0) {
            if(M < 45) System.out.printf("%d %d", 23, M-45+60);
            else System.out.printf("%d %d", H, M-45);
        } else {
            if(M < 45) System.out.printf("%d %d", H-1, M-45+60);
            else System.out.printf("%d %d", H, M-45);
        }
    }
}