/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }

        Node curr = head;
        //Create A->A'->B->B'
        while(curr!=null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;

            curr = copy.next;
        }
        // Handle random pointers
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next; 
            }
            //if A.random -> C then we want A'.random-> C' , in list C->C'
            curr = curr.next.next;
        }

        //seperate lists
        curr = head;

        Node copyHead = head.next;

        while(curr!=null){
            Node copy = curr.next;

            curr.next = copy.next;

            if(copy.next!=null){
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }

        return copyHead;

    }
}
