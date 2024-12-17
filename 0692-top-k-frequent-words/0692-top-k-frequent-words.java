class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new TreeMap<>();
        List<String>list = new ArrayList<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(int i=0;i<k;++i){
            String maxWord ="";
            int times = 0;
            for(String word:map.keySet()){
                if(map.get(word)>times){
                    times = map.get(word);
                    maxWord = word;
                }
            }
            list.add(maxWord);
            map.put(maxWord,0);
        }
        return list;
    }
}