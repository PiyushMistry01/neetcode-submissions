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
        if(head.next == null){
            head = null;
            return head;
        }

        if(head.next.next == null){
            if(n==1){
                head.next = null;
                return head;
            }
            else{
                head = head.next;
                return head;
            }
        }

        //reverse 1
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;

        int i=1;
        if(n==1){
            head = head.next;
        }
        else{
        prev = null;
        curr = head;
        while(i<n){
            prev = curr;
            curr = curr.next;
            i++;
        }
        ListNode temp = curr.next;
        prev.next = temp;
        curr.next = null;
        }

        //reverse 2
        prev = null;
        curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;


    }
}
