class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        permute(list,nums,0);
        return list;
    }
    private static void permute(List<List<Integer>>list,int[]nums,int index){
        if(index==nums.length){
            List<Integer>li = new ArrayList<>();
            for(int i=0;i<nums.length;++i){
                li.add(nums[i]);
            }
            if(!list.contains(li)){
                list.add(li);
            }
            return ;
        }
        for(int i=index;i<nums.length;++i){
            swap(nums,index,i);
            permute(list,nums,index+1);
            swap(nums,index,i);
        }

    }
    private static void swap(int[]nums,int index,int i){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}