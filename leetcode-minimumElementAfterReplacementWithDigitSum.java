class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            int sum = sumOfDigit(nums[i]);
            min = Math.min(min, sum);
        }
        return min;

    }

    int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}