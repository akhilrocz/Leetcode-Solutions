class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode current =head;
        int length=0;

        while(current!=null){
            length++;
            current=current.next;
        }

        current=head;

        int middle = length/2;

        if(length==1) return null;

        for(int i=0;i<middle-1;i++){
            current =current.next;
        }

        current.next = current.next.next;

        return head;
    }
}