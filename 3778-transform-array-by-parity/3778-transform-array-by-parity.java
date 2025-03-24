class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int zero = 0;
        int one = 0;
        for(int i = 0; i<nums.length; ++i){
            if(nums[i]%2==0)
                zero++;
            else
                one++;
        }
        int index = 0;
        while(index<zero)
            ans[index++] = 0;
        while(index<nums.length)
            ans[index++] = 1;
       
       
        return ans; 
    }
}