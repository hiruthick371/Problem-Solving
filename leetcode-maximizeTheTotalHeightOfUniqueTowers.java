class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        long sum = 0;
        int prev = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; --i) {
            int curr = Math.min(maximumHeight[i], prev - 1);
            if (curr < 1)
                return -1;
            sum += curr;
            prev = curr;
        }
        return sum;
    }
}