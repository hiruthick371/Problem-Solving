class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left=1;
        int right=nums.length-1;
        int sum=nums[0]+nums[1]+nums[2];
        int ans = sum;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;++i){
            left=i+1;
            right=nums.length-1;
            while(left<right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum==target){
                    return sum;
                }
               else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                int diff = Math.abs(sum-target);
                if(diff<min){
                    min = diff;
                    ans = sum;
                }
                
            }
        }
        return ans;
    }
}