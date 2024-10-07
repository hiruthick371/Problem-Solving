class Solution {
    public int minLength(String s) {
        Stack<Character>st = new Stack<>();
        for(char chr:s.toCharArray()){
            if(st.isEmpty()){
                st.push(chr);
                continue;
            }
            else if(st.peek()=='A'&& chr=='B')
                st.pop();
            else if(st.peek()=='C' && chr=='D')
                st.pop();
            else
                st.push(chr);
        }
     return st.size();
    }
}