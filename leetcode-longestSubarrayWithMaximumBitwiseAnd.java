class Solution {
    public int longestSubarray(int[] nums) {

        int count=0;
        int max=Integer.MIN_VALUE;
        int res=0;
        for(int num:nums){
                max=Math.max(max,num);
        }
        for(int num:nums){
            if(num==max){
               res=Math.max(res,++count);
                }
            else{
                count=0;
            }
        }
        return res;
    }
}