package LinkedList;

public class ListNode {
    int val;
    ListNode next;

    // Constructor 1: Creates an empty node
    public ListNode() {
    }

    // Constructor 2: Creates a node with a value
    public ListNode(int val) {
        this.val = val;
    }

    // Constructor 3: Creates a node with a value and next reference
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
