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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(temp!=null){
            if(temp==head && head.val==val){
                head = head.next;
            }
            else if(temp.next != null && temp.next.val==val){
                ListNode t = temp.next;
                while(t!=null && t.val==val){
                    t = t.next;
                }
                temp.next = t;
            }
            temp = temp.next;
        }
        return head;
    }
}