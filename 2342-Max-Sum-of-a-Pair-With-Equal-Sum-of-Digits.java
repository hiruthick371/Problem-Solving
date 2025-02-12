class Solution {
    public int maximumSum(int[] nums) {
       int[] sum = new int[82];
       int ans = -1;
       for(int num:nums){
        int val = sumOfDigits(num);
        if(sum[val]!=0){
            ans = Math.max(ans,num+sum[val]);
        }
        sum[val] = Math.max(sum[val], num);
       }
      return ans;
        
    }
    private int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}