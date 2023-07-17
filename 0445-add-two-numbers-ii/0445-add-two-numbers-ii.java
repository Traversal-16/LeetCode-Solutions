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
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        List<Integer> list1=new ArrayList <>();
        List<Integer> list2=new ArrayList <>();
        while (l1!=null)
        {
            list1.add (l1.val);
            l1=l1.next;
        }   
        while (l2!=null)
        {
            list2.add (l2.val);
            l2=l2.next;
        }
        List<Integer> sum=new ArrayList <>();
        int carry=0;
        while (list1.size ()>0 && list2.size()>0)
        {
            int sum1=list1.get (list1.size()-1)+list2.get (list2.size()-1);
            sum1+=carry;
            list1.remove (list1.size ()-1);
            list2.remove (list2.size()-1);
            if (sum1>9)
            {
                carry=1;
                sum1=sum1-10;
            }
            else
            {
                carry=0;
            }
            sum.add (sum1);
        }
        while (list1.size()>0)
        {
           int sum1=list1.get (list1.size()-1);
            sum1+=carry;
            list1.remove (list1.size ()-1);
            if (sum1>9)
            {
                carry=1;
                sum1=sum1-10;
            }
            else
            {
                carry=0;
            }
            sum.add (sum1); 
        }
    
        while (list2.size()>0)
        {
           int sum1=list2.get (list2.size()-1);
            sum1+=carry;
            list2.remove (list2.size ()-1);
            if (sum1>9)
            {
                carry=1;
                sum1=sum1-10;
            }
            else
            {
                carry=0;
            }
            sum.add (sum1); 
        }
        ListNode  ans=new ListNode (sum.get (sum.size()-1));
        ListNode ans2=ans;
        for (int i=sum.size()-2;i>=0;i--)
        {
            ans2.next=new ListNode (sum.get (i));
            ans2=ans2.next;
        }
        ListNode k2=new ListNode ();
        if (carry==1)
        {
            k2=new ListNode (1);
            k2.next=ans;
        }
        else
        {
            k2=ans;
        }
        return k2;
    }
}