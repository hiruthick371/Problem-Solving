class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] placed = new boolean[baskets.length];
        for(int i = 0; i<fruits.length; ++i) {
            for(int j = 0; j<baskets.length; ++j) {
                if(fruits[i]<=baskets[j] && !placed[j]) {
                    placed[j] = true;
                    break;
                }
            }
        }
        int count = 0;
        for(boolean flag : placed) {
            if(flag == false) count++;
        }
        return count;
    }
}