class Solution {
    public int findComplement(int num) {

        int bitCount=0;
        int n = num;
        while(num>0){
            bitCount++;
            num/=2;
        }
        int maskedBit = (int)(Math.pow(2,bitCount) -1);
        return n^ maskedBit;
        
    }
}