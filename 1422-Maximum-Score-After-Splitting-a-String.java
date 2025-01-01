class Solution {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;
        int max = -1;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='0') zeros++;
            else ones++;
            if(s.length()-1!=i) max = Math.max(zeros-ones,max);
        }
        return max+ones;
    }
}