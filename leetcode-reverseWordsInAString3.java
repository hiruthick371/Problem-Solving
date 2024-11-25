class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;++i){
            arr[i]=reverse(arr[i]);
        }
        String str ="";
        for(int i=0;i<arr.length;++i){
            str+=arr[i];
            if(i!=arr.length-1)
            str+=" ";
        }
        return str;
    }
    String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        return String.valueOf(sb);
    }
}