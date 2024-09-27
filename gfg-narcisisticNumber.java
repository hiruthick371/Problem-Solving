class Solution{
    static int isNarcissistic(int N){
        // code her
        int temp=N;
        int sum=0;
        int count = (int)Math.log10(N)+1;
        while(N>0){
            int digit = N%10;
            sum=sum+(int)(Math.pow(digit,count));
            N/=10;
        }
        return sum==temp?1:0;
    }
}