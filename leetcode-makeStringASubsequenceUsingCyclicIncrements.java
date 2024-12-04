class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int left =0;
        int right = 0;
        while(left<str1.length() && right<str2.length()){
            char ch = str1.charAt(left);
            if(ch=='z') ch ='a';
            else ch++;
            if(str1.charAt(left) ==str2.charAt(right)){
                left++; right++;
            }
            else if( ch==str2.charAt(right)){
                left++; right++;
            }
            else{
                left++;
            }
        }
      return (right==str2.length())?true:false;
    }
}