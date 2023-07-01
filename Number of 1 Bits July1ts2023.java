https://practice.geeksforgeeks.org/problems/set-bits0143/1
class Solution {
    static int setBits(int N) {
        // code here
        String binary=Integer.toBinaryString(N);
        int set=0;
        for(int i=0; i<binary.length(); i++)
        {
            if(binary.charAt(i)== '1')
            {
                set++;
            }
        }
        return set;
    }
}
