class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>arr = new ArrayList<>();
        int max=0;
        for(int i:candies){
            if(max<i){
                max=i;
            }
        }
        for(int i:candies){
            if(i+extraCandies>=max)
            arr.add(true);
            else
            arr.add(false);
        }
        return arr;    
    }
}