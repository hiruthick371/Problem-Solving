/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fast=headA;
        ListNode slow=headB;
        // Set<ListNode>set = new HashSet<>();
        // while(fast!=null){
        //     set.add(fast);
        //     fast=fast.next;
        // }
        // while(slow!=null){
        //     if(set.contains(slow)){
        //         return slow;
        //     }
        //     slow=slow.next;
        // }
        while(fast!=slow ){
            fast= fast==null?headB:fast.next;
            slow = slow==null?headA:slow.next;
        }
        
         return fast;
        
    }
}