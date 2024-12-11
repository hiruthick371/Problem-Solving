class Solution {
    public int maximumLength(String s) {
        int max = -1;
        int count=0;
        for(int i=0;i<s.length();++i){
            for(int j=i+1;j<=s.length();++j){
        if(checkSpecial(s.substring(i,j)) && checkCount(s.substring(i,j),s) ){
                max = Math.max(max,j-i);
            }
            } 
        }
        return max;    
    }
    static boolean checkSpecial(String str){
        HashMap<Character,Integer>map = new HashMap<>();
        for(char chr:str.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
        if(map.size()==1){
            return true;
        }
        return false;
    }
    static boolean checkCount(String str,String s){
        int count = 3;
        int currentCount=0;
        System.out.println("Substring from main: "+str);
        for(int i=0;i<s.length();++i){
           for(int j=i+1;j<=s.length();++j){
            if(str.equals(s.substring(i,j))){
                currentCount++;
            }
           }
        }
        System.out.println("current count:"+currentCount);
        return count<=currentCount;
    }
}