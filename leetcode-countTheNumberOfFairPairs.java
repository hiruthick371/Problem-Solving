class Solution {
    public long countFairPairs(int[] num, int lower, int upper) {
        Arrays.sort(num);
        return findnum(num,upper+1) - findnum(num,lower);
       
    }
    long findnum(int[] nums,int num){
        int left = 0;
        int right = nums.length-1;
        long result=0;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum<num){
                result+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}