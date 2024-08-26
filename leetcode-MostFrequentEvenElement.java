class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxx = Arrays.stream(nums).max().getAsInt();
        int freq[]=new int[maxx+1];
        for(int i=0;i<nums.length;++i){
            if(nums[i]%2==0)
            freq[nums[i]]++;
        }
        int freqIndex=-1;
        int max=0;
        for(int i=0;i<freq.length;i+=2){
            if(freq[i]>max || max==freq[i] && i<freqIndex ){
                max = freq[i];
                freqIndex=i;
            }
        }

        return freqIndex;
        
    }
}