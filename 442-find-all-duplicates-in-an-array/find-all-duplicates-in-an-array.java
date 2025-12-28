class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
      List <Integer>result = new ArrayList<>();  
      for(int index =0;index<nums.length;index++){
        if(nums[index]!=index+1)
        result.add(nums[index]);
      }
      
        return result;
    }
    //cyclic sort 
    static void cyclicSort(int[]arr){
        int i = 0;
        int n = arr.length;
        while(i<n){
            int currentIndex = arr[i]-1;//index = value -1
            if(arr[i]!=arr[currentIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }else{
                i++;
            }
        }
    }

}