class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;++i){
            prefix[i] = nums[i] + prefix[i-1];
        }
        long total = prefix[nums.length-1];
        for(int i = 0;i<nums.length-1;++i){
            if(prefix[i]>=total - prefix[i]) count++;
        }
        return count;
    }
}