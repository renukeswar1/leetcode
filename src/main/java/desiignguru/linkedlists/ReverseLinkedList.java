package main.java.desiignguru.linkedlists;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(2);
        //printList(reverseLinkedList(head1));
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.next + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
           ListNode next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }
        return prev;
    }
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            next = null;
        }
    }
}
