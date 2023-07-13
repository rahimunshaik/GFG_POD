https://practice.geeksforgeeks.org/problems/unique-frequencies-of-not/1

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        //1. Finding the  Frequncy of array
       Map<Integer, Integer> freq=new HashMap<>();
       
       for(int i:arr)
       {
           freq.put(i , freq.getOrDefault(i,0)+1);
       }
      //2.Finding the unique freq among them
     
        Set<Integer> uniqueFreq=new HashSet<>();
        
        for(int val : freq.values())
        {
            if(!uniqueFreq.add(val))
            {
                return false;
            }
        }
        return true;
    }
}
