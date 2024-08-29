class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        int sum3=n/3;
        for(int i=1;i<=sum3;++i){
            if(i*3<=n ){
                sum+=(i*3);
            }
        }
        int sum5=n/5;
        for(int i=1;i<=sum5;++i){
            if(i*5<=n&& (5*i)%3!=0){
                sum+=(i*5);
            }
        }
        int sum7=n/7;
        for(int i=1;i<=sum7;++i){
            if((i*7<=n)&& (7*i)%3!=0&& (7*i)%5!=0){
                sum+=(i*7);
            }
        }

        return sum;
    }
}