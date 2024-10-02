
class Solution {
    public int countGoodSubstrings(String s) {
        // Sliding window approach
        int left =0;
        int right = 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
          if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right++));
            if(set.size()==3){
                count++;
                set.remove(s.charAt(left++));
            }
          }
          else{
            set.remove(s.charAt(left++));
          }
          
        }
        return count;


        //Optimal approach without complicating things:

        int count=0;
        for(int i=0;i<s.length()-2;++i){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) &&
            s.charAt(i)!=s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}