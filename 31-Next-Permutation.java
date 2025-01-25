class Solution {
    public void nextPermutation(int[] nums) {
        int breakingPoint = -1;
        int firstGreater = -1;
        for(int i=nums.length-2;i>=0;--i){
            if(nums[i]<nums[i+1]){
                breakingPoint = i;
                break;
            }
        }
        if(breakingPoint == -1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>=0;--i){
                if(nums[i]>nums[breakingPoint]){
                    firstGreater = i;
                    break;
                }
            }
            swap(nums,breakingPoint,firstGreater);
            reverse(nums,breakingPoint+1);
        }
        
    }
    private static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private static void reverse(int[]nums,int start){
        int left = start;
        int right = nums.length-1;
        while(left<=right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}