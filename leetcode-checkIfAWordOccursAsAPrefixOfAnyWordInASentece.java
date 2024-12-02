class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;++i){
            // if(str[i].length()>=searchWord.length())
            // if(str[i].substring(0,searchWord.length()).equals(searchWord)){
            //     return i+1;
            // }
            if(str[i].startsWith(searchWord)) return i+1; 
            //startsWith is a builtin method
        }
        return -1;
    }
}