class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long sum =0;
        long max =0;
        for(int num:nums){
            sum+=max;
            max = Math.max(max,num);
        }
        return sum;
        
    }
}