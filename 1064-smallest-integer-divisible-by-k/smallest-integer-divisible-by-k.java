class Solution {
    public int smallestRepunitDivByK(int k) {
        //series
        //1 11 111 1111
        //k%1 == 0 if num is 1
        //k%2 ==0 if num is -1 not in the series 
        if(k%2==0 || k%5==0)return -1;
        //Brute force approach:
        //Let's take k =7(input)
        //simple formula to find the series is if num = 1 then num % k == 1 
        //now num *10 +1 = 11 becomes 
        //Again, 11% k = 4 
        //now 11 *10+1 = 111 You can also do (4*10+1=41)
        //111 % k = 6 You can also do(41 % 7=6)
        //Again 111 *10 +1 = 1111 You can also do (6*10+1=61)
        //1111 % k = 5 You can also do(61%7=5)
        //Again 1111 *10 +1=11111 You can also do(5*10+1)=51
        //11111 % k = 2 You can also do(51%7 = 2)
        //Again 11111 &*10+1=111111 You can also do(2*10+1)=21
        //111111 % k = 0 (found zero loop closed) You can also do (21%7)=0
        int rem = 0 ;

        for(int length = 1;rem <=k ;length++){
            rem = (rem * 10 + 1)%k;
            if(rem == 0)return length;
        }
        return -1;

        
    }
}