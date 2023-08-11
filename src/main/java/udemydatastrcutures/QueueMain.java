package main.java.udemydatastrcutures;

public class QueueMain {
    public static void main(String[] args) {

        QueueImpl myQueue = new QueueImpl(4);

        /*myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();*/
        myQueue.enqueue(2);
        myQueue.printQueue();
    }
}
