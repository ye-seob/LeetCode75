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
// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         ListNode current = head;
//         if(head.next == null) return null;
//         int length = 0;
        
//          while(current != null){
//             current = current.next;
//             length++;
//          }

//          int middleNodeIndex = length / 2;

//         current = head;
//          for(int i = 0; i < middleNodeIndex-1; i++){
//             current = current.next;
//          }

//           current.next  = current.next.next;

//           return head;
//     }
// }

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // 두칸씩 while문이 끝나면 fast는 마지막노드
            prev = slow; //삭제할 전 노드가 된다
            slow = slow.next;//한칸씩 while문이 끝나면 slow는 삭제할 노드가 됨
        }
        
        prev.next = slow.next;
        
        return head;
    }
}
