class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer>result = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                result.add(i+1);
            }
        }
        return result;
    }
    static void cyclicSort(int[]arr){
        int i=0;
        while(i<arr.length &&i<arr.length){
            int currentElement = arr[i]-1;
            if(arr[currentElement]!= arr[i]){
                //swap
                int temp = arr[currentElement];
                arr[currentElement] = arr[i];
                arr[i]=temp;
            }
            else{
            i++;
            }
        }
    }
}