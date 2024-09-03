import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[i] = a + b;
        }
        
        for(int k : array){
            System.out.println(k);
        }
    }
}