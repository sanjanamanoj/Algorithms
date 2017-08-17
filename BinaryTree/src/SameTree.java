/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class SameTree {

    public static boolean isSameTree(Node n1, Node n2){
        if(n1==null && n2==null)
            return true;
       if(n1!=null && n2!=null)
            return (n1.val==n2.val && isSameTree(n1.left,n2.left) && isSameTree(n1.right,n2.right));
        return false;
    }

    public static void main(String[] args)
    {
        BT tree1 = new BT();
        BT tree = new BT();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(9);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        if (isSameTree(tree.root, tree1.root))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}
