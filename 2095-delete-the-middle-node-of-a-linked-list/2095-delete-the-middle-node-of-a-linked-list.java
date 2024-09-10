/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        if(head.next == null) return null;
        int length = 0;
        
         while(current != null){
            current = current.next;
            length++;
         }

         int middleNodeIndex = length / 2;

        current = head;
         for(int i = 0; i < middleNodeIndex-1; i++){
            current = current.next;
         }

          current.next  = current.next.next;

          return head;
    }
}