class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] seive = new boolean[right+1];
        seive[0] = true;
        seive[1] = true;
        int a = -1;
        int b = -1;
        int diff = Integer.MAX_VALUE;
        for(int i = 2; i*i<=right; ++i) {
            if(!seive[i]) {
                for(int j = i*i; j<=right; j+=i) {
                    seive[j] = true;
                }
            }
        }
        List<Integer>primes = new ArrayList<>();
        for(int i = left; i<=right; ++i) {
            if(!seive[i]) 
                primes.add(i);
        }
        if(primes.size() <=1) 
            return new int[]{-1, -1};
        for(int i = 1; i<primes.size(); ++i) {
            if(primes.get(i) - primes.get(i-1) < diff) {
                a = primes.get(i-1);
                b = primes.get(i);
                diff = b - a;
            }
        }
        return new int[]{a, b};
    }
}