class Solution {
    public boolean isValid(String s) {
        Stack<Character> exp = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='{'){
                exp.push('}');
            }
            else if(c=='(') exp.push(')');
            else if(c=='[') exp.push(']');
            else if(exp.isEmpty() || exp.pop()!=c){
                return false;
            }
            
        }
return exp.isEmpty();
        
    }
}