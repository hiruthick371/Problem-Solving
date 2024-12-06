class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {

        //HashSet Approach
         Set<Integer>set = new HashSet<>();
        int count=0,sum=0;
        for(int num:banned){
            set.add(num);
        }
       for(int i=1;i<=n;++i){
        if(set.contains(i)){
            continue;
        }
        if(i<=maxSum){
            count++;
            maxSum-=i;
        }
        else{
            break;
        }
       }
       return count;


      //Optimized Approach using boolean array 
      int sum = 0;
      int count = 0;
      boolean[] ban = new boolean[10001];
      for(int num:banned){
        ban[num] = true;
      }
      for(int i=1;i<=n;++i){
        if(sum+i>maxSum){
            break;
        }
        if(!ban[i]){
            sum+=i;
            count++;
        }
      }
      return count;
    }
}