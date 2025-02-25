class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;++i){
            String sorted = sort(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
          
        }
        return new ArrayList<>(map.values());
    }
    private static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}