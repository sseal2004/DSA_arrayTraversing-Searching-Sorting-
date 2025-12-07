class Solution {
    public int mySqrt(int x) {
            int ans =0;
        while((long)pow(ans+1,2)<=x){
            ans++;
        }
        return ans;
    }
    static long pow(long base,int exp){
        long multi =1;
        for(int i=0;i<exp;i++){
            multi *=base;
        }
        return multi;

    } 

}