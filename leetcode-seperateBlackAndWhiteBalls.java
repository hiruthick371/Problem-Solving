class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long swap = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                swap += count;
            } else
                count++;
        }
        return swap;
    }
}