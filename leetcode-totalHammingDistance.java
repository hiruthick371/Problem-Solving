class Solution {
    public int totalHammingDistance(int[] nums) {
        
        int distance = 0;
        for(int i=0;i<nums.length;++i){
            for(int j=i;j<nums.length;++j){
                distance+= Integer.bitCount(nums[j]^nums[i]);
            }
        }
        return distance;
    }
}