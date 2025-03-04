class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            int bit = n%3;
            if(bit>1) return false;
            n/=3;
        }
        return true;
    }
}