class Node{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class DepthOfBinaryTree {
    public static int DepthTree(Node root)
    {
       if(root==null)
       {
           return 0;
       }

       int left=DepthTree(root.left);
       int right=DepthTree(root.right);
       int max=Math.max(left,right);

       return max+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);

        System.out.println(DepthTree(root));
    }
}
