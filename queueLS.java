import java.util.Queue;
import java.util.LinkedList;

public class queueLS {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        // Adding elements to the queue
        queue.add("alkmvl");
        queue.add("bvmflkm");
        queue.add("cmlvml");

        System.out.println("Queue after adding elements: " + queue);
        
        // Removing an element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removing an element: " + queue);

        // Peeking at the front element of the queue
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
        System.out.println("Queue after peeking: " + queue);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Getting the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }   
}