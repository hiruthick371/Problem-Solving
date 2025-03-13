class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] sweep = new int[nums.length + 1];
        for(int i = 0; i<queries.length; ++i) {
            int left =  queries[i][0];
            int right = queries[i][1];
            sweep[left]++;
            sweep[right + 1]--;
        }
        for(int i = 1; i<=nums.length; ++i) {
            sweep[i] += sweep[i-1];
        }
        for(int i = 0; i<nums.length; ++i) {
            if(sweep[i] < nums[i])
                return false;
        }
        return true;
    }
}