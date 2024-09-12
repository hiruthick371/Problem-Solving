class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean[]freq=new boolean[26];
        for(char c:allowed.toCharArray()){
            freq[c-'a']=true;
        }
        for(int i=0;i<words.length;++i){
                if(isValid(freq,words[i])){
                    count++;
                }
            }
        return count;
    }
    boolean isValid(boolean freq[],String word){
        for(int i=0;i<word.length();++i){
            if(!freq[word.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}