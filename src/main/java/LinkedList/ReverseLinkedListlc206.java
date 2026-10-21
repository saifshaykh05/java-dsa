package LinkedList;

import java.util.List;

public class ReverseLinkedListlc206 {
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}
