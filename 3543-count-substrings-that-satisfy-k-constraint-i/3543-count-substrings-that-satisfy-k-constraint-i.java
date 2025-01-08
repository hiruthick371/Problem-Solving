class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int right = 0;
        int zeros = 0;
        int ones = 0;
        int count = 0;
        while(right<s.length()){
            if(s.charAt(right)=='0')
                zeros++;
            else
                ones++;
            while(zeros>k && ones>k){
                if(s.charAt(left)=='0')
                    zeros--;
                else
                    ones--;
                left++;
            }
            count+=(right-left+1);
            right++;
        }
      
        return count;
    }
}