/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class BT {
    Node root;

    BT() {
        this.root =null;
    }

    BT(int val){
        Node n = new Node(val);
        this.root = n;
    }

    void inorder(Node n){
        if(n!=null){
            inorder(n.left);
            System.out.println(n.val);
            inorder(n.right);
        }
    }

    void preorder(Node n) {
        if(n!=null){
            System.out.println(n.val);
            preorder(n.left);
            preorder(n.right);
        }
    }

    void postorder(Node n) {
        if(n!=null){
            postorder(n.left);
            postorder(n.right);
            System.out.println(n.val);
        }
    }

    public static void main(String[] args){
        BT tree = new BT(5);
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
//        tree.inorder(tree.root);
//        tree.preorder(tree.root);
//        tree.postorder(tree.root);

    }
}
