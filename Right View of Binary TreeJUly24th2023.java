class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> al=new ArrayList<>();
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        
        rightTree(node,0);
        return al;
        
    }
    void rightTree(Node node, int level)
    {
        if(node==null)
        {
            return;
        }
        if(level==al.size())
        {
            al.add(node.data);
        }
       rightTree(node.right,level+1);
       rightTree(node.left,level+1);
    }
}
