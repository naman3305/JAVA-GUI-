import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
public class printSpiral {
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
      
      printSpiral(root);
    }
    static void printSpiral(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        
        Stack<Integer> s=new Stack<Integer>();
        
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                if(reverse)
                    s.push(curr.key);
                else
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse)
            {
                while(s.isEmpty()==false)
                {
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
            System.out.println();
        }
    }
}
