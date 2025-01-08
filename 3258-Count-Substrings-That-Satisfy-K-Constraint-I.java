class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i= 0;i<s.length();++i){
            for(int j = i;j<s.length();++j){
                if(checkNums(s.substring(i,j+1),k)){
                    count++;
                }
            }
        }

        
        return count;
    }
    private boolean checkNums(String str, int k){
        int countZeros = 0;
        int countOnes = 0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='0'){
                countZeros++;
            }
            else{
                countOnes++;
            }
        }
       
        return(countZeros<=k) || (countOnes<=k);
    }
}