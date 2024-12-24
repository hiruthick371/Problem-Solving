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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        List<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        if(k>list.size()) return head;
        for(int i=0;i<=list.size()-k;i+=k){
            Collections.reverse(list.subList(i,i+k));
        }
        temp = head;
        int i = 0;
        while(temp!=null){
            temp.val = list.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}