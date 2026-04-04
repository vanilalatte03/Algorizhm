import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int cards = sc.nextInt();
        int lastCard = 0;

        for (int i = 1; i <= cards; i++){
            queue.offerLast(i);
        }

        while(!queue.isEmpty()){
            lastCard = queue.pollFirst();
            if (queue.isEmpty()){
                break;
            }
            queue.offerLast(queue.pollFirst());
        }

        System.out.println(lastCard);

    }
}