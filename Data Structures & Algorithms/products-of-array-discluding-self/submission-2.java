class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftProdArray = new int[nums.length];
        leftProdArray[0]=1;
        for(int i=1; i<nums.length; i++){
            leftProdArray[i]=leftProdArray[i-1]*nums[i-1];
        }

        int[] resArray = new int[nums.length];
        int rightProd = 1;
        resArray[nums.length-1]=1;
        for(int i=nums.length-1; i>=0; i--){
            resArray[i]=rightProd*leftProdArray[i];
            rightProd*=nums[i];
        }
        return resArray;
    }
}  
