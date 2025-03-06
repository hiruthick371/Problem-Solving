class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] nums = new int[grid.length * grid[0].length];
        int index = 0;
        for(int i = 0; i< grid.length; ++i) {
            for(int j = 0; j<grid[0].length; ++j) {
                nums[index++] = grid[i][j];
            }
        }
        Arrays.sort(nums);
        int[] ans = new int[2];
        for(int i = 1; i<nums.length; ++i){
            if(nums[i] == nums[i-1]) {
                ans[0] = nums[i];
                break;
            }
        }
        if(nums[0]!=1) 
            ans[1] = 1;
        else if(nums[nums.length-1] == nums.length-1)
            ans[1] = nums.length;
        else {
            for(int i = 1; i<nums.length; ++i) {
                if(nums[i] - 1 == nums[i-1] + 1) {
                    ans[1] = nums[i] - 1;
                    break;
                }
            }
        }
        return ans;
    }
}