class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[nums[i]-1]) {
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
            else {
                i++;
            }
        }
        for(int x=0;x<nums.length;x++) {
            if(nums[x]!=x+1) {
                return x+1;
            }
        }
        return nums.length+1;
    }
}