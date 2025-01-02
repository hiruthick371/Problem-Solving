class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
       int[] prefix = new int[words.length];
       int[] ans = new int[queries.length];
       Set<Character>set = new HashSet<>();
       set.addAll(Arrays.asList('a','e','i','o','u'));
       if(words[0].length()<2){
        if(set.contains(words[0].charAt(0))){
            prefix[0] = 1;
        }
       }
       else{
        if(set.contains(words[0].charAt(0)) && set.contains(words[0].charAt(words[0].length()-1))){
            prefix[0] = 1;
        }
       }
      
       for(int i=1;i<words.length;++i){
        if(words[i].length()>1){
            if(set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length()-1))){
                prefix[i] = prefix[i-1]+1;
            }
            else{
                prefix[i] = prefix[i-1];
            }
        }
        else{
            if(set.contains(words[i].charAt(0))){
                prefix[i] = prefix[i-1]+1;
            }
            else{
                prefix[i] = prefix[i-1];
            }
        }
       }
       for(int i=0;i<queries.length;++i){
        if(queries[i][0]==0)
        ans[i] = prefix[queries[i][1]];
        else
        ans[i] = prefix[queries[i][1]] - prefix[queries[i][0]-1];
       }
       return ans;

    }
    }
    
   