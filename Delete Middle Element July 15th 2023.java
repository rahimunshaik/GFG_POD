https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

class Solution
{
    //Function to delete middle element of a stack.
    
    public static Stack<Integer> removeMid(Stack <Integer> st, int n, int i, int data){
        if(n==1){
            st.push(data);
            return st;
        }
        st=removeMid(st,n-1,i,st.pop());
        if(n!=i)
        st.push(data);
        return st;
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        // ceil( (sizeOfStack+1)/2);
        if(sizeOfStack==2){
            int x=s.pop();
            s.pop();
            s.push(x);
        }
        int i= sizeOfStack %2 == 0 ? (sizeOfStack/2) : (sizeOfStack/2 +1);
        s=removeMid(s, s.size(), i, s.pop());
    } 
}
