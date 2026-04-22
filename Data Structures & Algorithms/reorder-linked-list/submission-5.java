class Solution {
    public void reorderList(ListNode head) {
        if(head.next!=null && head.next.next!=null){
            ListNode slow = head;
            ListNode fast = head;
            ListNode serial = head;
            
            while(fast.next != null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode temp = slow.next;
            slow.next= null;
            ListNode reverse = temp;
            temp = temp.next;
            reverse.next= null;
            while(temp!=null){
                ListNode tmp = temp.next;
                temp.next = reverse;
                reverse = temp;
                temp = tmp;
            }
            ListNode output = null;
            while(serial!=null && reverse != null){
                if(output==null){
                    output = serial;
                    head = output;
                    serial = serial.next;
                    output.next = reverse;
                    reverse = reverse.next;
                    output = output.next;
                }
                else{
                    output.next = serial;
                    serial = serial.next;
                    output = output.next;
                    output.next = reverse;
                    reverse = reverse.next;
                    output = output.next;
                }
            }
            if(serial!=null){
                output.next = serial;
            }
            if(reverse!=null){
                output. next = reverse;
            }
        }
        
    }
}


// Approch taken:
// use fast - slow to determine mid value;
// first n/2 nodes taken as it is.
// i guess from mid+1 to last node : reverse.
// then add them one after another.
// this will work fine.