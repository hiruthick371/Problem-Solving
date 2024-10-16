class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>list = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0;
        int right = 0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                list.add(nums1[left]);
                left++; right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        int[] ans = new int[list.size()];
        int index=0;
        for(int num:list){
            ans[index++] = num;
        }
        return ans;
        
    }
}