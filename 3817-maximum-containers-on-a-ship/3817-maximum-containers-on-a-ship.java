class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalCell = n * n;
        if(totalCell * w > maxWeight)
            return maxWeight/w;
        return totalCell;
        
    }
}