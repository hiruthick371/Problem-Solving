class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<k;++i){
            int max = 0;
            int index = 0;
            for(int num:map.keySet()){
                if(map.get(num)>max){
                    max = map.get(num);
                    index = num;    
                }
            }
            list.add(index);
            map.put(index,0);
        }
      int[] ans = new int[list.size()];
      k=0;
      for(int num:list){
        ans[k++] = num;
      }
     return ans;
    }
}