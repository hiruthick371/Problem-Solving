class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long sum=0;
        long maxsum=0;
      for(int i=0;i<K;++i){
          sum+=Arr.get(i);
      }
      maxsum=Math.max(sum,maxsum);
      for(int i=K;i<N;++i){
          sum+=Arr.get(i);
          sum-=Arr.get(i-K);
          maxsum=Math.max(sum,maxsum);
      }
      
        return maxsum;
    }
}