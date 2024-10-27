class Solution {
    public long maxScore(int[] nums) {
         int n = nums.length;
        if (n == 1) {
            return nums[0] * nums[0];
        }
        long totalGCD = nums[0];
        long totalLCM = nums[0];
        for (int i = 1; i < n; i++) {
            totalGCD = gcd(totalGCD, nums[i]);
            totalLCM = lcm(totalLCM, nums[i]);
        }
        long maxScore = totalGCD * totalLCM; 
        for (int i = 0; i < n; i++) {
            long currentGCD = -1, currentLCM = -1;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                if (currentGCD == -1) {
                    currentGCD = nums[j];
                    currentLCM = nums[j];
                } else {
                    currentGCD = gcd(currentGCD, nums[j]);
                    currentLCM = lcm(currentLCM, nums[j]);
                }
            }
            maxScore = Math.max(maxScore, currentGCD * currentLCM);
        }
        return maxScore;
    }
    private long gcd(long a,long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
}