class Solution {
    public int trap(int[] height) {
        // int[]prefix_max = new int[height.length];
        // int[]suffix_max = new int[height.length];
        // prefix_max[0] = height[0];
        // for(int i=1;i<height.length;++i){
        //     prefix_max[i] = Math.max(prefix_max[i-1],height[i]);
        // }
        // suffix_max[height.length-1] = height[height.length-1];
        // for(int i=height.length-2;i>=0;--i){
        //     suffix_max[i] = Math.max(suffix_max[i+1],height[i]);
        // }
        // int trapped = 0;
        // for(int i=0;i<height.length;++i){
        //     trapped+=(Math.min(prefix_max[i],suffix_max[i])-height[i]);
        // }
        // return trapped;

        //Optimal solution
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trapped = 0;

        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]<leftMax){
                    trapped+=(leftMax-height[left]);
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if(height[right]<rightMax){
                    trapped+=(rightMax-height[right]);
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return trapped;
    }
}