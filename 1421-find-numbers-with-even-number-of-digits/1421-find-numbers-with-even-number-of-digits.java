class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; ++i) {
            if(countDigits(nums[i])%2==0)
                count++;
        }
        return count;
    }
    private static int countDigits(int num) {
        int digit = 0;
        while(num > 0) {
            digit++;
            num/=10;
        }
        return digit;
    }
}