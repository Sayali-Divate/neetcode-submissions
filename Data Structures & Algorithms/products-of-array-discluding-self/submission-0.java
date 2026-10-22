class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftProdArray = new int[nums.length];
        int leftProd = 1;
        leftProdArray[0]=1;
        for(int i=0; i<nums.length; i++){
            leftProdArray[i]=leftProd;
            leftProd*=nums[i];
        }

        int[] rightProdArray = new int[nums.length];
        int rightProd = 1;
        rightProdArray[nums.length-1]=1;
        for(int i=nums.length-1; i>=0; i--){
            rightProdArray[i]=rightProd;
            rightProd*=nums[i];
        }

        int[] resArray = new int[nums.length]; 
        for(int i=0; i<leftProdArray.length; i++){
            resArray[i]=leftProdArray[i]*rightProdArray[i];
        }
        return resArray;
    }
}  
