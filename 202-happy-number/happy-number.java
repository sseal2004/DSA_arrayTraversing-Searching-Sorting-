class Solution {
    public boolean isHappy(int n) {
       if(n==1)return true;
       int sum =0;
       while(n!=0){
        sum+=(int)Math.pow(n%10,2);
        n/=10;
       }
       if (sum >4){
        return isHappy(sum);
       }
       if(sum ==1)return true;
       return false;
        
    }
}