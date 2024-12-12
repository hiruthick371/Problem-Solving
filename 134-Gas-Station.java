class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costSum = 0;
        int gasSum = 0;
        for(int i=0;i<cost.length;++i){
            costSum+=cost[i];
            gasSum+=gas[i];
        }
        if(gasSum<costSum) return -1;
        int diff=0; int start=0;
        for(int i=0;i<cost.length;++i){
            diff += gas[i] - cost[i];
            if(diff<0){
            diff=0;
            start=i+1;
            }
           
        }
       return start;
    }
}