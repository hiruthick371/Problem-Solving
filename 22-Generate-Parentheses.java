class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtracking(list,n,0,0,\\);
        return list;
    }
    private void backtracking(List<String>list,int n,int open,int close ,String str){
        if(str.length()==n*2){
            list.add(str);
            return ;
        }
       if(open<n)
        backtracking(list,n,open+1,close,str+\(\);
        if(close<open)
        backtracking(list,n,open,close+1,str+\)\);
    }
}