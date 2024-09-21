class Solution {
    public List<Integer> lexicalOrder(int n) {
        int number=1;
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;++i){
            list.add(number);
            if(number*10<=n){
                number*=10;
            }
            else{
                while(number%10==9 || number>=n){
                    number/=10;
                }
                number++;
            }
        }
        return list;
    }
}