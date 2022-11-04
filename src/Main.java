import Interfaces.CustomExceptions.EmptyQueueException;
import Interfaces.CustomExceptions.EmptyStackException;
import Interfaces.DynamicArray;
import Interfaces.Impl.QueueImpl;
import Interfaces.Impl.StackImpl;

public class Main {
    public static void main(String[] args) {

        System.out.println("---STACK IMPLEMENTATION---");
        StackImpl stack = new StackImpl();

        stack.push(15);
        stack.push(37);
        stack.push(85);
        System.out.println("Stack: " + stack);

        for (int i=0; i<=stack.getStackSize(); i++ ){
            try{
                System.out.println("Peek last: " + stack.peek());
            }
            catch (EmptyStackException exception){
                System.out.println(exception.getMessage());
            }
        }

        int size = stack.getStackSize() ;
        for (int i=0; i<=size; i++ ){
            try{
                System.out.println( "Pop last: " + stack.pop() );
            }
            catch (EmptyStackException exception){
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("\n---QUEUE IMPLEMENTATION---");
        QueueImpl queue = new QueueImpl();

        queue.add(450);
        queue.add(98);
        queue.add(1580);
        System.out.println(queue);


        for (int i=0; i<=queue.getQueueSize(); i++ ){
            try{
                System.out.println("Peek first: " + queue.peek());
            }
            catch (EmptyQueueException exception){
                System.out.println(exception.getMessage());
            }
        }

        int queueSize = queue.getQueueSize() ;
        for (int i=0; i<=queueSize; i++ ){
            try{
                System.out.println("Pop first: " + queue.pop());
            }
            catch (EmptyQueueException exception){
                System.out.println(exception.getMessage());
            }

        }

    }
}