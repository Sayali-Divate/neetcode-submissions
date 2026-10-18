class Solution {

    public int climbStairs(int n) {
        int a=0; int b=1;
        int i=0;
        while(i<n){
            int temp = a+b;
            a = b;
            b = temp;
            i++;
        }
        return b;
        
    }

}
