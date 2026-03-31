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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode ptr = result;
        int carry = 0;
        while(l1!=null && l2!= null){
            int add = 0;
            add = (l1.val + l2.val + carry) %10;
            carry = (l1.val + l2.val + carry )/10;
            l1 = l1.next;
            l2 = l2.next;
            if(result.val==-1) {
                result = new ListNode(add);
                ptr= result;
            }
            else{
                ptr.next = new ListNode(add);
                ptr = ptr.next;
            }
        }
        while(l1!=null){
            int add = 0;
            add = (l1.val + carry) %10;
            carry = (l1.val + carry) /10;
            l1 = l1.next;
            ptr.next = new ListNode(add);
            ptr = ptr.next;
        
        }
        while(l2!=null){
            int add = 0;
            add = (l2.val + carry) %10;
            carry = (l2.val + carry) /10;
            l2 = l2.next;
            ptr.next = new ListNode(add);
            ptr = ptr.next;
        }
        if(carry!=0){
            ptr.next = new ListNode(carry);
        }
        return result;
    }
}