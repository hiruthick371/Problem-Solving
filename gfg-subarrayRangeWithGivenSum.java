class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int sum =0;
        int count=0;
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;++i){
            sum+=arr[i];
            if(sum==tar) count++;
            if(map.containsKey(sum-tar)){
                count+=map.get(sum-tar);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}