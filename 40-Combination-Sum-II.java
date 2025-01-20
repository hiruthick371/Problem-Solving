class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>list = new ArrayList<>();
        combinations(list,new ArrayList<>(),candidates,target,0);
        return list;
        
    }
    private void combinations(List<List<Integer>>list,ArrayList<Integer>li,int[]nums,int target,int index){
            if(target==0){
                list.add(new ArrayList<>(li));
            }
        for(int i=index;i<nums.length;++i){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            li.add(nums[i]);
            combinations(list,li,nums,target-nums[i],i+1);
            li.remove(li.size()-1);
        }
    }
}