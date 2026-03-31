class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1 ;
        ListNode leftTemp = null;
        while(count+1 < left){
            count++;
            leftTemp = leftTemp==null ? head : leftTemp.next;
        }
        leftTemp = leftTemp==null?head:leftTemp.next;
        if(left==1) {
            leftTemp = null;
            count = 0;
        }

        ListNode reversed = null;
        ListNode move = (leftTemp!=null) ? leftTemp.next : head;
        ListNode last = null;

        while(count < right && move!=null){
            if(reversed == null){
                reversed = (leftTemp!=null) ? leftTemp.next : head;
                move = move.next;
                reversed.next=null;
                last = reversed;
            }
            else{
                ListNode temp = move;
                move = move.next;
                temp.next = reversed;
                reversed = temp;
            }
            count++;
        }
        if(leftTemp!=null){
            leftTemp.next = reversed;
            last.next = move;
        }
        else{
            head = reversed;
            last.next= move;
        }
        return head;
    }
}