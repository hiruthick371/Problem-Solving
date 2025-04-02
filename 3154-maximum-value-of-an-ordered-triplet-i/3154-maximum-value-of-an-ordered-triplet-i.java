class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxNum = 0;
        long maxDiff = 0;
        long ans = 0;
        for(int num : nums) {
            ans = Math.max(ans, num * maxDiff);
            maxNum = Math.max(maxNum, num);
            maxDiff = Math.max(maxDiff, maxNum - num);
        }
        return ans;
    }
}