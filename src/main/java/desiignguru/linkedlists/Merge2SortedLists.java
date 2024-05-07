package main.java.desiignguru.linkedlists;

public class Merge2SortedLists {
    public static void main(String[] args) {
        Node list1 = new Node(1, new Node(3, new Node(6)));
        Node list2 = new Node(2, new Node(4));

        Node result = mergeTwoLists(list1, list2);
        while(result != null){
            System.out.println(result.data+ " ");
            result = result.next;
        }
    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node current = dummy;
        while(l1 != null && l2 != null) {
            // Compare nodes and append the smaller one to current
            if(l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null) current.next = l1;
        else current.next = l2;
        return dummy.next;
    }
}
