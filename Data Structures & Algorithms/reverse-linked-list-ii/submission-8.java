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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1 ;
        ListNode leftTemp = null;
        while(count+1 < left){
            count++;
            leftTemp = leftTemp==null?head:leftTemp.next;
        }
        
        leftTemp = leftTemp==null?head:leftTemp.next;

        if(left==1) {leftTemp = null; count = 0;}

        ListNode reversed = null;
        ListNode move = (leftTemp!=null) ? leftTemp.next : head;
        System.out.println("move = "+ move.val);
        System.out.println(" "+ move.val);

        ListNode last = null;
        while(count < right && move!=null){
            
            System.out.println("count : "+count);
            if(reversed == null){
                reversed = (leftTemp!=null) ? leftTemp.next : head;
                move = move.next;
                reversed.next=null;
                last = reversed;
                System.out.println("reversed : "+ reversed.val);

            }
            else{
                ListNode temp = move;
                move = move.next;
                temp.next = reversed;
                reversed = temp;
            }
            System.out.println("rev : "+reversed.val);
            count++;

        }
        if(leftTemp!=null){
            leftTemp.next = reversed;
            last.next = move;
        }
        else{
            System.out.println("kkrev : "+reversed.val);
            head = reversed;
            last.next= move;
        }
        return head;
    }
}