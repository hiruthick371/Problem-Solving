class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        for(int i=1;i<arr.length;++i){
            arr[i]^=arr[i-1];
        }

        for(int i=0;i<ans.length;++i){
            int left=queries[i][0];
            int right = queries[i][1];
            if(left==0){
                ans[i] = arr[right];
            }
            else{
                ans[i]=arr[right]^arr[left-1];
            }
        }
       
        return ans;
    }
}