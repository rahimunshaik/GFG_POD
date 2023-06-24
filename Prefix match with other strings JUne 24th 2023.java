https://practice.geeksforgeeks.org/problems/prefix-match-with-other-strings/1

class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        String sub=str;
        if( k < str.length())
        {
            sub=str.substring(0,k);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            String s=arr[i];
            if(k < arr[i].length())
            {
                s=arr[i].substring(0,k);
            }
            if ((s).equals(sub) && s.length() >= k)
            {
                count++;
            }
        }
        return count;
    }
}
