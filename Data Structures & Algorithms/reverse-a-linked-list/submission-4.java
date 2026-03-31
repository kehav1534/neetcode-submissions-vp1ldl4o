/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { thizs.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode();
        if(head==null||head.next==null) return head;
        if(head.next!= null){
            temp = head;
            head = temp.next;
            temp.next  = null;
        }
        while(head!=null){
            ListNode temp1 = new ListNode();
            temp1 = head.next;
            head.next = temp;
            temp = head;
            head = temp1;
        }
        head = temp;
        temp = null;
     return head;   
    }
}
