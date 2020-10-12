import java.util.*;
public class countNodeInCompleteBinaryTree {
    public static void main(String args[])
    {
        Node root=new Node(10);
      root.left=new Node(20);
      root.right=new Node(30);
      root.left.left=new Node(40);
      root.left.right=new Node(50);
      root.right.left=new Node(60);
      
      System.out.print(countNode(root));
    }
    static int countNode(Node root)
    {
        int lh=0,rh=0;
        Node curr=root;
        while(curr!=null)
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null)
        {
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
            return ((int)Math.pow(2,lh)-1);
        return 1+countNode(root.left)+countNode(root.right);
    }
}
