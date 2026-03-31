/// Made it over-complicated... Look for better and simpler approch

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /// Reverse the List -> then remove the nth position.
        //// or
        /// take slow and fast approch.
        int countJumps = 0;
        int length = 0;
        if(head.next==null && n > 0) return null;
        else if(head.next.next==null)   length = 2;
        ListNode fast = head;
        while(length == 0){
            countJumps++;
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
        if(length-n==0) return head.next;
        ListNode curr = head;
        for(int i = 1; i < length - n ; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }
}
