https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1


/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
ArrayList<ArrayList<Integer>> ans=new  ArrayList<ArrayList<Integer>>();
   
       for(int i=0; i<r; i++){
            ArrayList<Integer> l=new ArrayList<>();
           for(int j=0; j<c; j++){
               l.add(a[i][j]);
           }
           if(!ans.contains(l)){
               ans.add(l);
           }
       }
       return ans;
    }
}
