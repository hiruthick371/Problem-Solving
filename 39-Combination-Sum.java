class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list = new ArrayList<>();
        f(list,new ArrayList<>(),candidates,target,0,candidates.length);
        return list;
    }
    private static void f(List<List<Integer>>list,List<Integer>li,int[] nums,int target,int i,int n){
        if(i==n){
            if(0==target){
            list.add(new ArrayList<>(li));
            }
            return;
        }
        if(nums[i]<=target){

        li.add(nums[i]);
        f(list,li,nums,target-nums[i],i,n);
        li.remove(li.size()-1);
        }
        f(list,li,nums,target,i+1,n);
    }
}