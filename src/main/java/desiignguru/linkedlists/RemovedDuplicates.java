package main.java.desiignguru.linkedlists;

public class RemovedDuplicates {
    public static void main(String[] args) {

    }
    public Node removeDuplicates(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        while(current != null || current.next != null){
            if(current.data == current.next.data ){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
