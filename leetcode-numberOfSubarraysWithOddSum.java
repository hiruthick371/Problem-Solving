class Solution {
    public int numOfSubarrays(int[] arr) {
        long sum = 0;
        long count=0;
        long mod = 1000000007;
        int []prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;++i){
            prefix[i] = arr[i]+prefix[i-1];
        }
        long odd = 0;
        long even = 0;
        for(int i=0;i<prefix.length;++i){
            if(prefix[i]%2==0) even++;
            else odd++;
        }
        long ans = odd+(odd*even);
        return (int)(ans%mod);
    }
}