class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue = 0;
        long currentValue = 0;
        for(int i = 0; i<nums.length; ++i) {
            for(int j = i+1; j<nums.length; ++j) {
                for(int k = j+1; k<nums.length; ++k) {
                    currentValue = (long)(nums[i] - nums[j]) * nums[k];
                    if(currentValue > maxValue) 
                        maxValue = currentValue;
                }
            }
        }
        return (maxValue>0)?maxValue:0;
    }
}