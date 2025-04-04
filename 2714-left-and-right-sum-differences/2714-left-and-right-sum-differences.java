class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int[] ans = new int[nums.length];
        int index = 0;

        for(int num : nums)
            rightSum += num;
        for(int num: nums) {
            rightSum -= num;
            ans[index++] = Math.abs(rightSum - leftSum);
            leftSum += num;
        }
        return ans;
    }
}