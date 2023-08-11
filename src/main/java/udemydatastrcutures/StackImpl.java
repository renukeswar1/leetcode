package main.java.udemydatastrcutures;

public class StackImpl {
    private Node top;
    private int height;

    StackImpl(int value){
        Node newNode = new Node(value);
        top = newNode;
        height++;
    }
    class  Node{
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    public void push(int value){
        Node newNOde = new Node(value);
        if(height == 0){
            top = newNOde;
        } else {
            newNOde.next = top;
            top= newNOde;
        }
        height++;
    }
    public void printStack(){
        Node temp = top;
        while (temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        if(top == null){
            System.out.println("Top is empty");
        }else{
            System.out.println("Top value "+top.value);
        }
    }
    public void getHeight() {
        System.out.println("Height: " + height);
    }
    public Node pop(){
        if(height == 0){
            return null;
        }else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }
}
