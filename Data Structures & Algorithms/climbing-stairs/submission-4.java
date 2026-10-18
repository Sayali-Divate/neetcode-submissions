class Solution {

    

    public int climbStairs(int n) {
        int[] cache = new int [n];
        Arrays.fill(cache, -1);
        return calculateDistinct(0, n, cache);
        
    }

    int calculateDistinct(int x, int n, int[] cache){
        if(x==n) return 1;
        if(x>n) return 0;
        if(cache[x]!=-1) return cache[x];

        return cache[x] = calculateDistinct(x+1, n, cache)+calculateDistinct(x+2, n, cache);
        
    }
}
