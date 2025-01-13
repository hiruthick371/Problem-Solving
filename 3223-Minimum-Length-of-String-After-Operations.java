class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        int len = s.length();
        for(int i=0;i<freq.length;++i){
            while(freq[i]>=3){
                freq[i]-=2;
                len-=2;
            }
        }
        return len;
    }
}