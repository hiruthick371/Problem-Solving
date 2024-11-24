class Solution {
    public int maxArea(int[] heights) {
        int height = 0;
        int width = 0;
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        int area = 0;
        while(left<=right){
            height = right-left;
            width = Math.min(heights[left],heights[right]);
            area = height*width;
            max = Math.max(area,max);
            if(heights[left]<heights[right]){
                left++;
            }
            else right--;
        }
        return max;
    }
}