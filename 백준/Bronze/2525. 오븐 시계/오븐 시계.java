import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
             
        B += C;
        
        A += B / 60;
        B = B % 60;
        
        A = A % 24;
        
        System.out.printf("%d %d", A, B);
        
      
    }
}