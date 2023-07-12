https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(R == 0) return 1;
        if(R == 1) return N;
        
        long mod=1000000007;
        long res=0;
        int half=R/2;
        long a=power(N,half);
        
        res=(a*a)%mod;
        
        if(R%2 !=0)
            res=(res*N)%mod;
        return res;
    }

}
