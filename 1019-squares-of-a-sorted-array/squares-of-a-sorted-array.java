class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=nums.length-1;i>=0;i--){
            nums[i] = (int)power(nums[i],2);
        }
        Arrays.sort(nums); 
        return nums;       
    }
    static long power(long base,long exponent){
        long multi=1;
        for(int i =0;i< exponent;i++){
            multi*=base;
        }
        return multi;
    }
}