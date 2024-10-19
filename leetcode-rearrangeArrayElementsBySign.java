class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int posi=0;
        int negi=0;
        
        for(int i=0;i<nums.length;++i){
            if(nums[i]<0){
                neg[negi++]=nums[i];
            }
            else{
                pos[posi++]=nums[i];
            }
        }
        posi=0;
        negi=0;
        for(int i=0;i<nums.length;++i){
            if(i%2==0){
                nums[i] = pos[posi++];
            }
            else{
                nums[i] = neg[negi++];
            }
        }
        return nums;
        
    }
}