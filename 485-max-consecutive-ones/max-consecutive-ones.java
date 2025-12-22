class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int n = nums.length;
        if(n==0)return 0;
        int max =0;
        for(int i=0;i<n;i++){
            
            if(nums[i]==1){
                count++;
                max = Math.max(max,count);
            }else
            {
                count=0;
            }
        }
        return max;
    }
}