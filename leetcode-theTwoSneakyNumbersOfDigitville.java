class Solution {
    public int[] getSneakyNumbers(int[] nums) {
    int ans[]=new int[2];
    int freq[]=new int[nums.length];
    for(int i:nums){
        freq[i]++;
    }
    int k=0;
    for(int i=0;i<freq.length;++i){
        if(freq[i]==2){
            ans[k++]=i;
        }
    }
        return ans;
    }
}