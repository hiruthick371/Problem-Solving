class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       List<Integer>li = new ArrayList<>();
       for(int i =0;i<s1.length();++i){
            if(s1.charAt(i)!=s2.charAt(i)) li.add(i);
            if(li.size()>2) return false;
       }
       return (li.size()==0|| (li.size()==2 && 
       s1.charAt(li.get(0)) == s2.charAt(li.get(1)) &&
       s1.charAt(li.get(1)) == s2.charAt(li.get(0)))
       );
    }
}