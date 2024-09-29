class Solution {
    public int countOfSubstrings(String word, int k) {
        int totalCount = 0;
        int count =0;
        for(int i=0;i<word.length();++i){
            Set<Character>set=new HashSet<>();
            count=0;
            for(int j =i;j<word.length();++j){
                if(isVowel(word.charAt(j))){
                    set.add(word.charAt(j));
                }
                else{
                    count++;
                }

                if(count>k){
                    break;
                }
                if(set.size()==5 && count==k){
                    totalCount++;
                }
            }
        }
       return totalCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}