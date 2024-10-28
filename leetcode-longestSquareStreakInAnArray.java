class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long>set = new HashSet<>();
        int max = -1;
        for(int num:nums) set.add(num*1l);
        for(int num:nums){
            int len = 1;
            while(set.contains(num*1l*num*1l)){
                len++;
                max = Math.max(len,max);
                num=(num*num);
            }
        }
        return max;
    }
}