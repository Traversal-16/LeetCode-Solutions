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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null || head.next==null) 
        return null;    

        int c=0;                                          
        ListNode cur=head;
        while(cur!=null)
        {
            cur=cur.next;
            c++;
        }
        if(n==c) return head.next; 

        ListNode temp=head;
        for(int i=0; i<c-n-1; i++) temp=temp.next;
        if(n==1) 
        {
        temp.next=null; 
        }                         
        else
        {
         temp.next=temp.next.next;   
        }                
        return head;
    }
}