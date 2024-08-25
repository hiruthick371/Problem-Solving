class Solution {
    public int countPairs(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;++i){
            for(int j=i+1;j<nums.length;++j){
                if(swap(nums[i],nums[j])){
                    count++;
                }
            }
        }
        return count;
    }

    boolean swap(int n,int m){
        String s1=Integer.toString(n);
        String s2=Integer.toString(m);
        while(s1.length()<s2.length()) s1="0"+s1;
        while(s1.length()>s2.length()) s2="0"+s2;
        if(s1.equals(s2)) return true;
        List<Integer> list=new ArrayList<>();
        for(int k=0;k<s1.length();k++){
            if(s1.charAt(k)!=s2.charAt(k)) list.add(k);
        }
        
         if (list.size() == 2) {
            char[] s1Array = s1.toCharArray();
            char temp = s1Array[list.get(0)];
            s1Array[list.get(0)] = s1Array[list.get(1)];
            s1Array[list.get(1)] = temp;
            String swappedS1 = new String(s1Array);

            return swappedS1.equals(s2);
        }
        return false;
    }
}
         