import java.util.Collections;
import java.util.PriorityQueue;


public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(Collections.reverseOrder());

        // Adding elements to the priority queue
        priorityQueue.add("alkmvl");
        priorityQueue.add("bvmflkm");
        priorityQueue.add("cmlvml");
        priorityQueue.add("ad");

        System.out.println("Priority Queue after adding elements: " + priorityQueue);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        
    //     String removedElement = priorityQueue.remove();
    //     System.out.println("Removed element: " + removedElement);
    //     System.out.println("Priority Queue after removing an element: " + priorityQueue);

    //     // Peeking at the front element of the priority queue
    //     String frontElement = priorityQueue.peek();
    //     System.out.println("Front element: " + frontElement);
    //     System.out.println("Priority Queue after peeking: " + priorityQueue);

    //     // Checking if the priority queue is empty
    //     boolean isEmpty = priorityQueue.isEmpty();
    //     System.out.println("Is the priority queue empty? " + isEmpty);

    //     // Getting the size of the priority queue
    //     int size = priorityQueue.size();
    //     System.out.println("Size of the priority queue: " + size);
    // }
}
}
