class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
      int ans = 0;
      int sum = 0;
      int prefix[] = new int[arr.length];
      prefix[0] = arr[0];
      for(int i=1;i<arr.length;++i){
        prefix[i] = prefix[i-1]+arr[i];
      }
      for(int i=0;i<arr.length;++i){
        sum=0;
        for(int j=i;j<arr.length;++j){
            sum+=arr[j];
            if((j-i+1) %2==1){
                ans+=sum;
            }
        }
      }
     
      return ans;
    }
}