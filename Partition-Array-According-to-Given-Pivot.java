class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[]ans = new int[nums.length];
        int index = 0;
        int count = 0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]<pivot){
                ans[index++] = nums[i];
            }
            if(nums[i]==pivot) count++;
        }
        System.out.println(count);
        while(count>0){
            ans[index++] = pivot;
            System.out.println(pivot);
            count--;
        }
        for(int i = 0;i<nums.length;++i){
            if(nums[i]>pivot){
                ans[index++] = nums[i];
            }
        }
        return ans;
    }
}