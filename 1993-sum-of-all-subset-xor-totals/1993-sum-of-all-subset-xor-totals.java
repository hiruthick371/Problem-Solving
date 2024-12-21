class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length; int sum = 0;
        subset(list,new ArrayList<>(),nums,0,n);
        list.remove(list.size()-1);
        int xor = 0;
        for(int i=0;i<list.size();++i){
            xor = 0;
            for(int j=0;j<list.get(i).size();++j){
                xor^=list.get(i).get(j);
            }
            sum+=xor;
        }
        return sum;
        
    }
    private void subset(List<List<Integer>>list,ArrayList<Integer>li,int[]nums,int i, int n){
        if(i>=n){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        subset(list,li,nums,i+1,n);
        li.remove(li.size()-1);
        subset(list,li,nums,i+1,n);
    }
}