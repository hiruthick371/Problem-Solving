class Solution {
    public String clearDigits(String s) {
        Stack<Character>st = new Stack<>();
        for(Character ch:s.toCharArray()){
            st.add(ch);
            if(ch<'a' || ch>'z' && st.size()>2){
                st.pop();
                st.pop();
            }
        }
        StringBuilder sb =new StringBuilder() ;
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}