class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[] = new int[k];
        int rem = 0;
        for (int i = 0; i < arr.length; ++i) {
            arr[i] %= k;
            if (arr[i] < 0)
                arr[i] += k;
            freq[arr[i]]++;
        }
        if (freq[0] % 2 != 0) // First element must be even indicating that a pair of nums must be divisible by k
            return false;
        for (int i = 1; i <= k / 2; ++i) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }
}