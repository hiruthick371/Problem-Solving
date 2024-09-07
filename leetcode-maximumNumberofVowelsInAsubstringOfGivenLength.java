class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int vowels = 0;
        int count = 0;
        int freq[] = new int[s.length()];
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            freq[i]=1;
         }
        }

        while(right<s.length()){
            count+=freq[right];
            if(right-left+1==k){
                vowels=Math.max(count,vowels);
                count-=freq[left];
                left++;
            }
            right++;
        }

        return vowels;
       
    }
}