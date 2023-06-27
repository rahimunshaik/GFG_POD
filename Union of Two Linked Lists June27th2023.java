https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1
class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    TreeSet<Integer> s= new TreeSet<>();
	    Node first=head1;
	    Node prev=null;
	    
	    while(first !=null)
	    {
	        s.add(first.data);
	        first=first.next;
	    }
	    first=head2;
	     while(first !=null)
	    {
	        s.add(first.data);
	        first=first.next;
	    }
	    first=head1;
	    for(int x : s)
	    {
	        first.data=x;
	        prev=first;
	        first=first.next;
	        if(first==null)
	        {
	            first=head2;
	        }
	    }
	        prev.next=null;
	        first=head1;
	        while(first.next!=null)
	         {
	            first=first.next;
	         }
	        if(first != prev)
	        {
	            first.next=head2;
	        }
	        return head1;
	}
}
