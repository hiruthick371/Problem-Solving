class Solution {
    public boolean check(int[] nums) {
        if (nums.length <= 1) 
            return true;
        int smallCount = 0;
        for(int i = 1; i<nums.length; ++i) {
            if (nums[i] < nums[i-1]) 
                smallCount++;
        }
        if (nums[0] < nums[nums.length-1]) 
            smallCount++;
        return smallCount <= 1;
    }
}