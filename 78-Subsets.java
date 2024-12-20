class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
       
        int n = nums.length;
        ArrayList<Integer>li = new ArrayList<>();
        f(list,new ArrayList<>(),nums,0,n);
        return list;

    }
    private void f(List<List<Integer>>list,ArrayList<Integer>li,int[]nums,int i,int n){
        if(i>=n){
        list.add(new ArrayList<>(li));
        return;
        } 
        li.add(nums[i]);
        f(list,li,nums,i+1,n);
        li.remove(li.size()-1);
        f(list,li,nums,i+1,n);
    }
}