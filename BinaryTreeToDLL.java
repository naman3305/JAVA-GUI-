import java.util.*;

public class BinaryTreeToDLL {
 
    Node prev=null;
    
    Node BTToDLL(Node root)
    {
     if(root==null)
         return root;
     Node head=BTToDLL(root.left);
     if(prev==null)
         head=root;
     else
     {
         root.left=prev;
         prev.right=root;
     }
     prev=root;
     BTToDLL(root.right);
     return head;
    }
   
    public static void main(String args[])
    {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.right.left=new Node(30);
        root.right.right=new Node(35);
        BinaryTreeToDLL btt=new BinaryTreeToDLL();
        Node head=btt.BTToDLL(root);
    }
}
