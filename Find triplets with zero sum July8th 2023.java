https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0; i<n ;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k] > 0)
                {
                    k--;
                }else if(arr[i]+arr[j]+arr[k] < 0)
                {
                    j++;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
