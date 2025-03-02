class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < nums1.length; ++i){
            map.put(nums1[i][0], nums1[i][1]);
        }
        for(int i = 0; i < nums2.length; ++i){
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0)+nums2[i][1]);
        }
        int ans[][] = new int[map.size()][2];
        int index = 0;
        for(int num:map.keySet()){
            ans[index][0] = num;
            ans[index][1] = map.get(num);
            index++;
        }
    return ans;
    }
}