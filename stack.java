import java.util.Stack;


public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Pushing elements onto the stack
        stack.push("alkmvl");
        stack.push("bvmflkm");
        stack.push("cmlvml");

        System.out.println("Stack after pushing elements: " + stack);
        
        // Popping an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping an element: " + stack);

        // Peeking at the top element of the stack
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peeking: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
