/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        ListNode current = head;

        while (current != null) {
            ListNode after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        return before;
    }
}
