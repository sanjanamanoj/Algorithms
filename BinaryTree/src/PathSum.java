/**
 * Created by sanjanamanojkumar on 8/16/17.
 *
 * Given a binary tree and a number, return true if the tree has a root-to-leaf path such
 * that adding up all the values along the path equals the given number.
 * Return false if no such path can be found.
 */
public class PathSum {

    public static boolean isPathSum(Node root, int sum){
        if(root==null)
            return false;
        if(sum-root.val==0 && root.left==null && root.right==null)
            return true;
        return (isPathSum(root.left,sum-root.val) || isPathSum(root.right,sum-root.val));
    }

    public static void main(String args[])
    {
        int sum = 20;

        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */

        BT tree = new BT();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        if (isPathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
    }
}
