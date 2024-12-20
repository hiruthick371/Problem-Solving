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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer>duplicates = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        ListNode temp = head;
        if(head==null) return head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val)
                duplicates.add(temp.val);
            temp = temp.next;
        }
       temp = head;
       while(temp!=null){
        if(!duplicates.contains(temp.val)){
            list.add(temp.val);
        }
        temp = temp.next;
       }
        if(list.size()==0) return null;
    temp = head;

    for(int i =0;i<list.size();++i){
        temp.val = list.get(i);
        if(i==list.size()-1) break;
        temp=temp.next;
    }
    temp.next = null;
    return head;
    }
}