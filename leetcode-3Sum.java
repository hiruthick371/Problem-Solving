class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Set<List<Integer>> l = new HashSet<>();
        for (int i = 0; i < n - 2; ++i) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    l.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        list.addAll(l);
        return list;
    }
}