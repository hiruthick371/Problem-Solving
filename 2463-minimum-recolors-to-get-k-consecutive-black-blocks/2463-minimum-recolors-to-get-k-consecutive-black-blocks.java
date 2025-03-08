class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int whites = 0;
        for(int i = 0; i<=blocks.length()-k; ++i) {
          for(int j = i; j<i+k; ++j) {
            if(blocks.charAt(j) == 'W') whites++;
          }
          min = Math.min(whites, min);
          whites = 0;
        }
        return min;
    }
}