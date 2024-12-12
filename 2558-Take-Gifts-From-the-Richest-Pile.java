class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum =0;
        int j=0;
        double val = 0;
        while(j<k){
            Arrays.sort(gifts);
            val = Math.sqrt(gifts[gifts.length-1]);
            gifts[gifts.length-1] = (int)val;
            j++;
        }
       
        for(int i=0;i<gifts.length;++i)
            sum+=gifts[i];
        return sum;
    }
}