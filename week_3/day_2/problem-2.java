//Particition list
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
    public ListNode partition(ListNode head, int x) {
        ListNode current=head;
        ListNode first=new ListNode(0);
        ListNode tailf=first;
        ListNode second=new ListNode(0);
        ListNode tails=second;
        while(current!=null){
            if(current.val<x){
                tailf.next=new ListNode(current.val);
                tailf=tailf.next;
            }
            else{
                tails.next=new ListNode(current.val);
                tails=tails.next;
            }
            current=current.next;
        }
        tailf.next=second.next;
        ListNode ans=first.next;
        return ans;
    }
}
