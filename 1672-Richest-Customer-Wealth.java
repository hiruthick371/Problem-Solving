class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int curr_max=0;
        for(int i=0;i<accounts.length;++i){
            curr_max=0;
            for(int j =0;j<accounts[i].length;++j){
                curr_max+=accounts[i][j];
            }
            max = Math.max(max,curr_max);
        }
        return max;
    }
}