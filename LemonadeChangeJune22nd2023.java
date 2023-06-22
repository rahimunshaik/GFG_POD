Question-----https://practice.geeksforgeeks.org/problems/lemonade-change/1

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        
        int count5=0;
        int count10=0;
        int count20=0;
        boolean set=false;
        
        for(int i=0; i<N ; i++)
        {
            if(bills[i] == 5)
            {
                  count5++;
                  set=true;
                
            }
            if(bills[i] ==10)
            {
                if(count5>=1)
                {
                    count5--;
                    count10++;
                    set=true;
                }
                else{
                    set=false;
                }
            }
            if(bills[i]==20)
            {
                if(count5 >=3 && count10 <=0)
                {
                    count5--;
                    count5--;
                    count5--;
                    count20++;
                    set=true;
                }
                else if (count10 >=1 && count5 >=1)
                {
                    count5--;
                    count10--;
                    count20++;
                    set=true;
                }
                else{
                    set=false;
                }
            }
            if(set==false)
            {
                return set;
            }
        }
        return set;
    }
}
