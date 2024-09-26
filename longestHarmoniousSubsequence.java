//Brute force
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = nums.length - 1; j >= i; --j) {
                if (nums[j] - nums[i] == 1) {
                    len = Math.max(j - i + 1, len);
                }
            }
        }
        return len;
    }
}

// HashMap
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                len = Math.max(len, map.get(num) + map.get(num + 1));
            }
        }
        return len;
    }
}

// Optimized
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        for (int i = 0, j = 0; j < nums.length; ++j) {
            if (nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                len = Math.max(j - i + 1, len);
            }

        }
        return len;
    }
}
