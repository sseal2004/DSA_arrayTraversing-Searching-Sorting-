class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        mergesort(nums,0,nums.length);
       int n = nums.length;
       int even =0;
       int odd=1;

       while(even<n && odd<n){
        if(nums[even]%2==0){
            even += 2;//no need to change if it in even place
        }else if(nums[odd]%2==1){
            odd += 2;//no need to change if it in odd place
        }
        else{
            int temp = nums[even];
            nums[even]=nums[odd];
            nums[odd]=temp;
            
        }
       }
               return nums;

    }
    static void mergesort(int[]arr,int start,int end){
        if(end-start<=1)return ;
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[]arr,int s,int m,int e){
        int[]mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k++]=arr[i++];
        }
        while(j<e){
            mix[k++]=arr[j++];
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}