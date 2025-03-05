class Solution {
    public long coloredCells(int n) {
        // long[]ans = new long[n];
        // ans[0] = 1;
        // for(int i = 1; i<n; ++i){
        //     ans[i] = (ans[i-1] + 4 * i);
        // }
        // return ans[n-1];

        return 1+(long)2*n*(n-1);
    }
}