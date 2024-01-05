/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        
    if(head==null || head.next==null)
    return false;
    ListNode slow,fast;
    slow=head;
    fast=head.next;
    while(slow!=fast)
    {
        if(fast==null || fast.next== null)//if fast reaches end no cycle detected
        {
            return false;
        }
        slow=slow.next;
        fast=fast.next.next;
    }
    return true;
    }
}
