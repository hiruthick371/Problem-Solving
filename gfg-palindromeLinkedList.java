class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
       List<Integer>list = new ArrayList<>();
       while(head!=null){
           list.add(head.data);
           head=head.next;
       }
        int start=0;
        int end=list.size()-1;
        while(start<=end){
            if(!list.get(start).equals(list.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}