/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class TreeSize {

    public static int getSize(Node root){
        if(root==null)
            return 0;
        return 1+ getSize(root.left)+getSize(root.right);
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        BT tree = new BT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The size of binary tree is : "
                + getSize(tree.root));
    }
}
