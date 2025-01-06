class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i=0;i<boxes.length();++i){
            int moves = 0;
            for(int j=0;j<boxes.length();++j){
                if(i==j) continue;
                if(boxes.charAt(j)=='0') continue;
                    moves += Math.abs(i-j);
            }
            ans[i] = moves;
        }
        return ans;
    }
}