class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>list = new ArrayList<>();
        subsets(list,new ArrayList<>(),s,0);
        return list;
    }
    private void subsets(List<List<String>>list,List<String>li,String s,int index){
        if(index==s.length()){
            list.add(new ArrayList<>(li));
            return ;
        }
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){
                li.add(s.substring(index,i+1));
                subsets(list,li,s,i+1);
                li.remove(li.size()-1);
            }
        }
    }
    private boolean isPalindrome(String str,int left,int right){
        while(left<=right){
            if(str.charAt(left++)!=str.charAt(right--)){
            return false;
            }
            
        }
        return true;
    }
    
}