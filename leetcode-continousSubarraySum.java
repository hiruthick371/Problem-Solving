class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int right = 0;
        int prod = 1;
        int count  =0;
        while(right<nums.length){
            prod*=nums[right];
            while(prod>=k && left<=right){
                prod/=nums[left++];
            }
            count+=(right-left+1);
            right++;
               
        }
        return count;
    }
}