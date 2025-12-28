class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1 ){
                return i+1;
            }
        }
        return n+1;
        
    }
    static void cyclicSort(int []nums){
        int i =0;
        while(i<nums.length){
            int currIndex = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length &&nums[i]!=nums[currIndex]){
                //swap
                nums[i] = nums[i]^ nums[currIndex];
                nums[currIndex] = nums[currIndex] ^ nums[i];
                nums[i] = nums[i] ^ nums[currIndex];

            }
            else{
            i++;
            }
        }
    }
}