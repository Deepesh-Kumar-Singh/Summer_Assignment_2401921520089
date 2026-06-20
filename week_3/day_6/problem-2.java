//Maximum Twin Sum of a Linked List
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
    public int pairSum(ListNode head) {
        int max=Integer.MIN_VALUE;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
        }
        ListNode rev=reverse(slow);
        ListNode current=head;
        while(rev!=null){
            int sum=rev.val+current.val;
            max=Math.max(max,sum);
            rev=rev.next;
            current=current.next;
        }
        return max;

    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode current =head;
        while(current!=null){
            ListNode next=current.next;
            current.next=pre;
            pre=current;
            current =next;
        }
        return pre;
    }
}
