https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
int i=0,j=0;
        long p=1;
        int ans=0;
    
        while(i<n&&j<n){
            p=p*a[j];
            while(p>=k&&i<=j){
                p=p/a[i];
                i++;
            }
            if(p<k)
            ans+=j-i+1;
            j++;
        }
        
        return ans;
        
    }
}
