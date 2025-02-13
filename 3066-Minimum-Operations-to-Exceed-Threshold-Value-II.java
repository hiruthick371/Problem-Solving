class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>pq = new PriorityQueue<>();
        int count = 0;
        for(int num:nums){
            pq.add((long)num);
        }
        while(!pq.isEmpty()){
             if(pq.peek()>=k){
                break;
            }
            long min1 = pq.poll();
            long min2 = pq.poll();
            long val = min1*2 + min2;
            pq.add(val);
            count++;
           
        }
        return count;
    }
}