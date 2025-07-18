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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode tail=head;
        int temp=0;
        int sum=0;
        while(l1!=null || l2!=null){
            sum=temp;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;}
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            temp=sum/10;
            sum=sum%10;
            tail.next=new ListNode(sum);
            tail=tail.next;
        }
        if(temp!=0){
            tail.next=new ListNode(temp);
        }
        head=head.next;
        return head;
    }
}
