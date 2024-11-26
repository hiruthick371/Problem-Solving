class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26]; // We can use Map too but it is only alphabets so no need of maps since alphabets contains only 26 values and no negative values
        for(char chr:s.toCharArray()){
            freq[chr - 'a']++;
        }
        for(int i = 0;i<s.length();++i){
            if(freq[s.charAt(i) - 'a']==1){
                return i;
            }
        }
        return -1;
    }
}