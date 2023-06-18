Ticket Counter:--https://practice.geeksforgeeks.org/problems/ticket-counter-2731/1
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int K)
    {
        int s=0,e=N+1;
        int q=N/K;
        int m=N%K;
        if(q%2 !=0)
        {
            s=s+K*(q/2 + 1);
            e=e-K*(q/2);
            e-=m;
            if( m!=0)
            return e;
            return s;
        }
        e=e-K*(q/2);
        s=s+K*(q/2);
        s+=m;
        
        if(m!=0)
        return s;
        return e;
    }
}
