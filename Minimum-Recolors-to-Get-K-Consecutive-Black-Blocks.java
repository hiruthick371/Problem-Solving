class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int blacks = 0;
        for(int i = 0; i<=blocks.length()-k; ++i) {
          for(int j = i; j<i+k; ++j) {
            if(blocks.charAt(j) == 'W') blacks++;
          }
          min = Math.min(blacks, min);
          blacks = 0;
        }
        return min;
    }
}