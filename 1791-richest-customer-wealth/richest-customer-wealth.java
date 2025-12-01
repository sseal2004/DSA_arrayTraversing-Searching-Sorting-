class Solution {
    public int maximumWealth(int[][] accounts) {
        return searchMaxWealth(accounts);
    }

    static int searchMaxWealth(int[][]arr){
        //person is row
        //account is col
        int max=Integer.MIN_VALUE;
        // for(int person=0;person<arr.length;person++){
            for(int[]person : arr){
            int rowSum=0;
            // for(int account=0;account<arr[person].length;account++){
            for(int account: person){
                //when you start a new col then take sum of that row
                // rowSum = rowSum + arr[person][account];
                rowSum+=account;

            }
                if(rowSum > max){
                    max = rowSum;
                }
            }
        return max;

    }
    
}