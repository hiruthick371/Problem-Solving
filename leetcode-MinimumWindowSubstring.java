class Solution {
    public String minWindow(String s, String t) {
  HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int m = t.length();
        int count = 0;
        int startIndex = -1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < m; ++i) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        while (right < n) {
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) >= 0) {
                    count++;
                }
            }
            while (count == m) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return (startIndex == -1) ? "" : s.substring(startIndex, startIndex + minLen);
    }
}