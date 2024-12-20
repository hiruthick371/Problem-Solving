class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list = new ArrayList<>();
        int n = nums.length;
        f(list,new ArrayList<>(),nums,0,n);
        return list;

        
    }
    private void f(List<List<Integer>>list,ArrayList<Integer>li,int[]nums,int i,int n){
        if(i>=n){
           
            if(!list.contains((li))) 
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        f(list,li,nums,i+1,n);
        li.remove(li.size()-1);
        f(list,li,nums,i+1,n);
    }
}