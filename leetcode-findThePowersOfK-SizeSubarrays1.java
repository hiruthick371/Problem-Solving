class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len-k+1];
        int index=0;
        int max = 0;
        for(int i=0;i<=nums.length-k;++i){
            if(sorted(nums,i,k)){
                max = maxx(nums,i,k);
                ans[index++] = max;
            }
            else
            ans[index++] = -1;
         
        }
        return ans;
        
    }
    boolean sorted(int[]nums,int start,int k){
        for(int i=start;i<start+k-1;++i){
            if(nums[i+1]-nums[i]!=1){
                return false;
            }
        }
        return true;
    }
    int maxx(int nums[],int start,int k){
        int max = 0;
        for(int i=start;i<=start+k-1;++i){
            max = Math.max(max,nums[i]);
        } 
        return max;
    }
}