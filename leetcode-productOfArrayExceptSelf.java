class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix_prod[]=new int[nums.length];
        int suffix_prod[]= new int[nums.length];
        prefix_prod[0]=nums[0];
        suffix_prod[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;++i){
            prefix_prod[i]=prefix_prod[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;--i){
            suffix_prod[i]=suffix_prod[i+1]*nums[i];
        }
        nums[0]=suffix_prod[1];
        nums[nums.length-1]=prefix_prod[nums.length-2];
        for(int i=1;i<nums.length-1;++i){
            nums[i] = prefix_prod[i-1] * suffix_prod[i+1];
        }
        return nums;
    }
}