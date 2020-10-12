import java.util.*;

public class DiameterBinaryTree {
   public static void main(String args[])
   {
        Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      root.left.left.left=new Node(8);
      root.left.left.right=new Node(9);
      root.right.left.right=new Node(10);
      
      System.out.print(diameter(root));
   }
  static int height(Node root)
   {
       if(root==null)
           return 0;
       else
           return 1+Math.max(height(root.left),height(root.right));
   }
   static int diameter(Node root)
   {
       if(root==null)
           return -1;
       int d1=1+height(root.left)+height(root.right);
       int d2=diameter(root.left);
       int d3=diameter(root.right);
       
       return Math.max(d1,Math.max(d2,d3));
               
   }
}
