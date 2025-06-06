class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map map = new HashMap();
        for(Integer i = 0;i<pattern.length();++i){
            if(map.put(pattern.charAt(i),i)!=map.put(words[i],i)){
                return false;
            }
        }
        return true;
    }
}