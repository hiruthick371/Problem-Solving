class Solution {
    public int minimumOperations(int[] nums) {
       boolean[] freq = new boolean[101];
       int right = nums.length-1;
       while(right>=0) {
        if (freq[nums[right]])
            break;
        freq[nums[right]] = true;
        right--;
       }
       return (right+3)/3;
    }
}