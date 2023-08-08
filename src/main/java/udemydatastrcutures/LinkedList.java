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

    public  boolean insert(int index,int value){
        if(index < 0 || index >length){
            return false;
        }
        if(index ==0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLastNode();
        }
        Node pre = get(index -1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before= null;
        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hashLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public Node findKthNodeFromLast(int k){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<k;i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
    public void reverseBetween(int m, int n) {
        // If the list is empty, there's nothing to reverse,
        // so we exit from the function immediately
        if (head == null) return;

        // Create a dummy node, a common trick used in linked
        // list problems to simplify the edge cases.
        // This node doesn't hold any meaningful data.
        Node dummy = new Node(0);
        // The next node of the dummy node is set to the head,
        // making dummy a pseudo-head of the list.
        dummy.next = head;
        // Initialize 'prev' as the dummy node. 'prev' will
        // keep track of the node right before the segment
        // to be reversed.
        Node prev = dummy;

        // Move 'prev' m steps forward in the list to make it
        // point to the node right before the segment to be reversed
        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }

        // 'current' will point to the first node of the segment
        // that is to be reversed.
        Node current = prev.next;
        // This loop will reverse the segment. It runs for
        // n - m times as that's the length of the segment.
        for (int i = 0; i < n - m; i++) {
            // 'temp' is the node right after 'current' that
            // will be moved to the front of the segment.
            Node temp = current.next;
            // Link 'current' to the node after 'temp'
            // effectively removing 'temp' from the segment.
            current.next = temp.next;
            // The next node of 'temp' is the node currently at
            // the front of the segment, so 'temp' is placed
            // right at the start of the segment.
            temp.next = prev.next;
            // Now, 'temp' becomes the first node of the reversed
            // segment by setting the next of 'prev' to 'temp'.
            prev.next = temp;
        }

        // After the loop, the segment is reversed but the head
        // of the list is still pointing to the dummy node.
        // So, update the head to point to the actual first node.
        head = dummy.next;
    }
}
