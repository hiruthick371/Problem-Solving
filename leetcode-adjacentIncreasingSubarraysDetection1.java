class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(nums.size()<2*k){
            return false;
        }
        if(k==1){
            return true;
        }
        for(int i=0;i<=nums.size()-2*k;++i){
        if(strictlyIncreasing(nums,i,k) && strictlyIncreasing(nums,i+k,k)){
                return true;
            }
        }
        return false;
    }
    boolean strictlyIncreasing(List<Integer>nums,int start,int end){
        for(int i = start;i<start+end-1;++i){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}