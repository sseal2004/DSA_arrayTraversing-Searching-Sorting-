class Solution {
    public int countOdds(int low, int high) {
        if(low<0||high<0)return -1;
       int ans = range(low,high);
        return ans;
    }
    static int range(int start ,int end){
        int count = (end - start)/2;
        if(start%2 !=0 || end%2 !=0) count++;
         return count;
    }
}