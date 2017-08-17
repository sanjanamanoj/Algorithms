import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class LevelOrderTraversal {

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.println(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        BT tree_level = new BT();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        levelOrder(tree_level.root);
    }
}
