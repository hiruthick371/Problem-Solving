class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int right=0;
        int len=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            len=Math.max(right-left+1,len);
            right++;
        }
        return len;
    }
}