class Solution {
    static String armstrongNumber(int N) {
        int temp=N;
        int sum=0;
        while(N>0){
            int digit = N%10;
            sum=sum+(int)(Math.pow(digit,3));
            N/=10;
        }
        return sum==temp?"true":"false";
    }
}