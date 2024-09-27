class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=(s2.charAt(j)))
                break;
            else
                sb.append(s1.charAt(i));
            i++;
            j++;
        }
        return sb.toString();
    }
}