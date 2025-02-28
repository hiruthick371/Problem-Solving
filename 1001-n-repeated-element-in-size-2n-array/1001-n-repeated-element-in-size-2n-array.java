class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int ans = 0;
        int n = nums.length;
        for(int num : map.keySet()){
            if(map.get(num) == n/2){
                ans = num;
            }
        }
        return ans;
    }
}