import java.util.LinkedList;
import java.util.Queue;

/*
 *   add() =>inserts the specified element in the queue,if the task is successful,add() returns true ,if not ,it throws an exception.
 *   offer() =>inserts the specified element in the queue,if the task is successful,add() returns true ,if not ,it  
 *    returns false.
 * 
 *   element()  => returns the head of the queue.Throws an exception if the queue is empty;
 *   peek()     => returns the head of the queue. return null if the queue is empty;
 * 
 *   remove()  => return and remove the head of the queue,Throws an exception if the queue is empty;
 *   poll() => return and remove the head of the queue,return null if the queue is empty;
 *  
 * 
 */

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}