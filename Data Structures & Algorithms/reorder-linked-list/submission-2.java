class Solution {
    public void reorderList(ListNode head) {
        if(head.next!=null && head.next.next!=null){
            ListNode slow = head;
            ListNode fast = head;
            ListNode serial = head;

            while(fast.next != null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                // System.out.println(">>slow "+slow.val);
            }
            // System.out.println("last slow "+slow.val);

            ListNode temp = slow.next;
            slow.next= null;
            // System.out.println("temp "+temp.val);

            ListNode reverse = temp;
            temp = temp.next;
            reverse.next= null;
            while(temp!=null){
                // System.out.println("rev "+reverse.val);
                ListNode tmp = temp.next;
                temp.next = reverse;
                reverse = temp;
                temp = tmp;
            }

            ListNode output = null;
            while(serial!=null && reverse != null){
                // System.out.println("serial "+serial.val);
                // System.out.println("reverse "+reverse.val);


                if(output==null){
                    output = serial;
                    head = output;
                    // System.out.println(output.val);
                    serial = serial.next;
                    output.next = reverse;
                    reverse = reverse.next;
                    output = output.next;
                    // System.out.println(output.val);
                    output.next = null;
                }
                else{
                    output.next = serial;
                    serial = serial.next;
                    output = output.next;
                    output.next = reverse;
                    reverse = reverse.next;
                    output = output.next;
                    output.next = null;
                }
            }
            if(serial!=null){
                output.next = serial;
            }
            if(reverse!=null){
                output.next = reverse;
            }
        }
        
    }
}
