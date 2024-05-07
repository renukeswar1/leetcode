package main.java.desiignguru.linkedlists;

public class DoubleListIsPalindrome {
    public static void main(String[] args) {
        DLNode head1 = new DLNode(1);
        head1.next = new DLNode(2);
        head1.next.prev = head1;
        head1.next.next = new DLNode(1);
        head1.next.next.prev = head1.next;
        System.out.println(isPalindrome(head1));
    }

    public static  boolean isPalindrome(DLNode head){
        if(head == null || head.next == null) return true;
        DLNode tail = head;
        while(tail.next != null)
            tail = tail.next;
        DLNode start = head;
        DLNode end = tail;
        while(start != end && start.prev !=end){
            if(start.val != end.val) return false;
            start = start.next;
            end = end.prev;
        }
        return  true;
    }

}

class DLNode {
    int val;
    DLNode next, prev;
    DLNode(int val) { this.val = val; }
}
