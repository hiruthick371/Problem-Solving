class Solution {
    public int[] countBits(int n) {
        int bitCount[] = new int[n+1];
        for(int i=0;i<n+1;++i){
            bitCount[i] = countOneBits(i);
        }
        return bitCount;
    }
    int countOneBits(int n){
        int count=0;
        while(n>0){
            count++;
            n&=(n-1);
        }
        return count;
    }
}