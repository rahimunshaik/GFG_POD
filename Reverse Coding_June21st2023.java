Question:--https://practice.geeksforgeeks.org/problems/reverse-coding2452/1
//User function Template for Java

class Solution {
    
    static int sumOfNaturals(int n) {
        // code here-usgin recursion
        // if(n==1)
        // {
        //     return 1;
        // }
        // return n+sumOfNaturals(n-1);
        //using formula sum of natural numbers--
        
        return (int) (((long) n* (n+1)) % (int) (1e9+7))/2;
    }
};
