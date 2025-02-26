class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int max = 0;
        int min = 0;
        int ans = 0;
        for(int i=0;i<nums.length;++i){
          sum+=nums[i];
            max = Math.max(sum,max);
            min = Math.min(sum,min);
        }
        ans = Math.abs(max-min);
        return ans;
    }
}