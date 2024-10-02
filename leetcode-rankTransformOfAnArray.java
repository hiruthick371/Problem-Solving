class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer>set = new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        int rank =1;
        for(int num:set){
            map.put(num,rank++);
        }
        int ans[] = new int[arr.length];
        for(int i=0;i<ans.length;++i){
            ans[i] = map.get(arr[i]);
        }
        return ans;   
    }
}