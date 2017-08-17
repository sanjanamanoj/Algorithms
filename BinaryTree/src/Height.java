/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class Height {

    public static int getHeight(Node root){
        if(root==null)
            return 0;
        else{
            int lheight = getHeight(root.left);
            int rheight = getHeight(root.right);
            if(lheight > rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }



    public static void main(String[] args){
        BT tree = new BT(5);
        tree.root.left = new Node(4);
        System.out.println(getHeight(tree.root));
//        tree.inorder(tree.root);
//        tree.preorder(tree.root);
//        tree.postorder(tree.root);

    }
}
