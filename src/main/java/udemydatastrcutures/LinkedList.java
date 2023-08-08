package main.java.udemydatastrcutures;

public class LinkedList {

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printlist(){
        Node temp = head;
        if(temp == null){
            System.out.println("No value");
        }

    }

    public void append(int value){
        Node appendNode = new Node(value);
        if(length == 0){
            head = appendNode;
            tail = appendNode;
        }else{
            tail.next=appendNode;
            tail = appendNode;
        }
        length++;
    }
    public Node removeLastNode(){
        // if the length is 0
        if(head ==null && tail ==null){
            return null;
        }else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length ==0){// this is edge case where there is only one element in the linkedlist
                head = null;
                tail = null;
            }
            return temp;
        }
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length ==0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index){
        if(index < 0 || index > length ){
            return null;
        }else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public boolean set(int index,int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
}
