class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int leftMax[] = new int[nums.length];
      int rightMax[] = new int[nums.length];
      int ans[] = new int[nums.length-k+1];
      leftMax[0] = nums[0];
      rightMax[nums.length-1] = nums[nums.length-1];
      for(int i=1;i<nums.length;++i){
        leftMax[i] = (i%k==0)?nums[i]:Math.max(leftMax[i-1],nums[i]);
        int j = nums.length-i-1;
        rightMax[j] = (j%k==0)?nums[j]:Math.max(rightMax[j+1],nums[j]);
      }
      for(int i=0;i<ans.length;++i){
        ans[i] = Math.max(leftMax[i+k-1],rightMax[i]);
      }
      return ans;
    }
}