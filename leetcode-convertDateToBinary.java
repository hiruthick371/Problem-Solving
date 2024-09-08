class Solution {
    public String convertDateToBinary(String date) {

        String ans[]=date.split("-");
        return Integer.toBinaryString(Integer.parseInt(ans[0]))+"-"+
        Integer.toBinaryString(Integer.parseInt(ans[1]))+"-"+
        Integer.toBinaryString(Integer.parseInt(ans[2])).toString();
        
    }
}