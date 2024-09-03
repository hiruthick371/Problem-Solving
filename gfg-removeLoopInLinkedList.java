    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                break;
                }
            }
            Node prev = slow;
            if(fast!=null && fast.next!=null){
                slow=head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                prev = slow;
                while(prev.next!=slow){
                    prev = prev.next;
                }
                prev.next = null;
            }
        
        
    }
}