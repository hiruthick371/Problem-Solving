class Solution {
    public int numberOfSubstrings(String s, int k) {
       int total = 0;
        for(int i=0;i<s.length();++i){
              int freq[] = new int[26];
              int current = 0;
            for(int j=i;j<s.length();++j){
                freq[s.charAt(j)-'a']++;
                if(freq[s.charAt(j)-'a']==k){
                    current++;
                }
                if(current>0){
                    total++;
                }    
            }
        }
        return total;
    }
}