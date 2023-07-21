class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node current = node;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            Node currentHead = current;
            Node prev = null;

            int count = 0;
            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }

            if (newHead == null) {
                newHead = prev;
            }

            if (prevTail != null) {
                prevTail.next = prev;
            }

            prevTail = currentHead;
        }

        return newHead;
    }
}
