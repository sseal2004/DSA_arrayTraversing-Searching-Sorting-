class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        int x=0;
       while(x<=31){
        int power = pow(2,x);
        if(power == n){
        return true;
        }

        x++;
       }
       return false;
    }
    static int pow(int base,int exp){
        int multi=1;
        for(int i=0;i<exp;i++){
            multi *= base;
        }
        return multi;
    }
}