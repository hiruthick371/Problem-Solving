class Solution {
    public int largestInteger(int[] nums, int k) {
        int[]freq = new int[51];
        for(int num:nums){
            freq[num]++;
        }
        if(k==nums.length){
            int ans = Arrays.stream(nums).max().getAsInt();
             return ans;
            }
        else if(k==1){
            for(int i = freq.length-1;i>=0;--i){
                if(freq[i]==1) return i;
            }
        }
        else{
            if(freq[nums[0]]==1 && freq[nums[nums.length-1]]==1){
                return Math.max(nums[0], nums[nums.length-1]);
            }
            else if(freq[nums[0]]!=1 && freq[nums[nums.length-1]]==1) return nums[nums.length-1];
            else if(freq[nums[0]]==1 && freq[nums[nums.length-1]]!=1) return nums[0];
        }
    return -1;
    }
}