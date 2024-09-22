class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        HashSet<String>list = new HashSet<>();
        for(String str : bannedWords){
            list.add(str);
        }
        for(int i=0;i<message.length;++i){
           if(list.contains(message[i])){
            count++;
           }
           if(count>=2){
            return true;
           }
        }
        return false;
    }
}