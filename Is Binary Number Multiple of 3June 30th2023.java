Is Binary Number Multiple of 3:--https://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1

  class Solution {
    int isDivisible(String s) {
        // code here
        int n=s.length();
        long num=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                if(i%2==0)
                {
                    num+=1;
                }else{
                    num+=2;
                }
            }
        }
        if(num%3 ==0)
        {
            return 1;
        }else{
            return 0;
        }
        
    }
}
