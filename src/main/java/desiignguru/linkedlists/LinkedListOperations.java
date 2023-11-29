package main.java.desiignguru.linkedlists;

public class LinkedListOperations {
    static Node head;
    public static void main(String[] args) {

    }
    public static void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void insertAfter(Node prev_node, int data){
        Node newNode = new Node(data);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    public static void delete(int data){
        Node tmp = head, prev = null;
        if(tmp != null && tmp.data == data){
            head = tmp.next;
            return;
        }
        while(tmp != null && tmp.data != data){
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = tmp.next;
    }
    public static boolean search(int data){
        Node current = head;
        while (current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =null;
        }
    }
}
