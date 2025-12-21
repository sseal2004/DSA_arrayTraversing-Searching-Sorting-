class Solution {
    public boolean checkPerfectNumber(int num) {
         return nonprime(num);
         
        }
    static boolean nonprime(int num){
        if(num<=1)return false;
        int i=2;
        int sum=1;
        while(i*i<=num){
            if(num%i==0){
                sum+=i;
                if(i!=num/i)
                sum = sum + num/i;
            };
            i++;

        }
        if(sum==num){
        return true;
        }
        
            return false;
        
    }
}