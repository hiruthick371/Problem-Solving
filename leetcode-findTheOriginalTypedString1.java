class Solution {
    public int possibleStringCount(String word) {
        int i=0;
        int count = 1;
        while(i<word.length()){
            int j = i;
            while(j<word.length() && word.charAt(i)==word.charAt(j)){
                j++;
            }
            count+=(j-i)-1;
            i=j;
        }
        return count;
    }
}