package main.java.udemydatastrcutures;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        StackImpl myStack = new StackImpl(2);
        myStack.push(14);
        myStack.push(11);
        myStack.push(19);
        myStack.push(10);
        myStack.printStack();
        myStack.pop();
        System.out.println("--------------");
        myStack.printStack();
        System.out.println("--------------");
        myStack.pop();
        myStack.printStack();

        /*

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

*/

    }
}
