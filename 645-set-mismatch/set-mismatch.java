class Solution {
    public int[] findErrorNums(int[] nums) {
        cyclicsort(nums);
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1)
            return new int[]{nums[index],index+1};

        }
        return new int[]{-1,-1};
        
    }
    //cyclic sorting 
    static void cyclicsort(int[]arr){
        int i=0;
        while(i<arr.length){
            int currentIndex = arr[i]-1;
            if(arr[i]!=arr[currentIndex]){
                //swap
                int temp = arr[currentIndex];
                arr[currentIndex]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
}