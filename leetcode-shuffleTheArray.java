class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int i=0;
        int j=n;
        int k=0;
        while(i<n && j< nums.length){
            ans[k++]=nums[i++];
            ans[k++]=nums[j++]; 
        }
        while(i<n){
            ans[k++]=nums[i++];
        }
        while(j<nums.length) ans[k++] = nums[j++];
        return ans;
    }
}