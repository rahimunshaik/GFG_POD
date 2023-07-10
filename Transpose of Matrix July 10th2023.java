https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1

//User function Template for Java
class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)//j -->i+1 to n or 0 ro i both are true
            {
              int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
                
            }
        }
    }
}
