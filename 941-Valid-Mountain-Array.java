class Solution {
    public boolean validMountainArray(int[] arr) {
       int pivot = -1;
       for(int i=1;i<arr.length-1;++i){
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            pivot = i;
            break;
        }
       }
       if(pivot==-1) return false;
       for(int i=0;i<pivot;++i){
        if(arr[i]>=arr[i+1]) return false;
       }
       for(int i=arr.length-1;i>pivot;--i){
        if(arr[i]>=arr[i-1]) return false;
       }
        return true;
    }
}