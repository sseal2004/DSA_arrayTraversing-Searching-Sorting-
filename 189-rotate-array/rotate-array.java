class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotater(nums,0,nums.length-1);
        rotater(nums,0,k-1);
        rotater(nums,k,nums.length-1);
    }
    public static void swap(int []arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void rotater(int[]arr,int left,int right){
        if(arr.length==0)return;
        
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}