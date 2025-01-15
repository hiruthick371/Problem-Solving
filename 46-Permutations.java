class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>list = new ArrayList<>();
        permutation(list,nums,0);
        return list;
    }
    private static void permutation(List<List<Integer>>list,int[]nums,int index){
        if(index==nums.length){
            List<Integer>li = new ArrayList<>();
            for(int i=0;i<nums.length;++i){
                li.add(nums[i]);
            }
            list.add(li);
            return;
        }
        for(int i=index;i<nums.length;++i){
            swap(nums,i,index);
            permutation(list,nums,index+1);
            swap(nums,i,index);
        }
    }
    private static void swap(int[]nums,int i,int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}