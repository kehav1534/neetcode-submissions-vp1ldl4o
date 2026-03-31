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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /// Reverse the List -> then remove the nth position.
        //// or
        /// take slow and fast approch.
        int countJumps = 0;
        int length = 0;
        if(head.next==null && n > 0) return null;
        else if(head.next.next==null)   length = 2;
        System.out.println(">>length "+length);

        ListNode fast = head;
        while(length == 0){
            countJumps++;
            System.out.println(">>count "+ countJumps);

            if(fast.next == null ){
                countJumps--;
                length = 2*countJumps + 1 ;
                break;
            }
            else if(fast.next.next == null){
                countJumps--;
                length = 2 * countJumps + 2;
                break;
            }
            fast = fast.next.next;
        }
        System.out.println("length "+length);

        if(length-n==0) return head.next;
        ListNode curr = head;
        for(int i = 1; i < length - n ; i++){
            curr = curr.next;
        }

        System.out.println(curr.val);
        curr.next = curr.next.next;
        return head;
    }
}
