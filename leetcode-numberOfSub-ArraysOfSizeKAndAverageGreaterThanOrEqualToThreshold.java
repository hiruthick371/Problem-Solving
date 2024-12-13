class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //Sliding Window approach
        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1 > k){
                sum-=arr[left];
                left++;
            }
            if(sum/k >=threshold && right-left+1==k){
                count++;
            }
            right++;
        }
        return count;

        //Alternative approach
        int sum = 0; int count = 0;
        for(int i=0;i<k;++i)
        sum+=arr[i];
        int prod = k*threshold;
        if(sum>=prod) count++;
        for(int i=k;i<arr.length;++i){
            sum-=arr[i-k];
            sum+=arr[i];
            if(sum>=prod) count++;
        }
        return count;
    }
}