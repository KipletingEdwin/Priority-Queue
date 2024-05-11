import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //  Priority Queue = A FIFO data structure that serves elements
        //  with the highest priorities first
        //  before elements with lower priority

        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(3.0);
        queue.offer(3.0);
        queue.offer(3.0);
        queue.offer(3.0);
        queue.offer(3.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }









    }
}