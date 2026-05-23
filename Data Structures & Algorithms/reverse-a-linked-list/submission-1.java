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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode Prev = head;
        ListNode Curr = head.next;
        while(Curr!=null){
            ListNode nextNode = Curr.next;
            Curr.next = Prev; 
            Prev = Curr;
            Curr = nextNode;
            
        }
        head.next = null;
        head =Prev;
        return head;
        
    }
}
