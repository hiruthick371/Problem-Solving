class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>idx = new ArrayList<>();
        int k = p.length();
        p=sort(p);
        for(int i=0;i<s.length()-k+1;++i){
            String sortedString = sort(s.substring(i,i+k));
            if(sortedString.equals(p)){
                idx.add(i);
            }
        }
        return idx;
    }
    String sort(String s){
        char[]sorted= s.toCharArray();
        Arrays.sort(sorted);
        return String.valueOf(sorted);
    }
}