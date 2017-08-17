import java.util.Set;

/**
 * Created by sanjanamanojkumar on 8/16/17.
 */
public class BST {

    Node root;

    BST() {
        this.root= null;
    }

    BST(Node n){
        this.root = n;
    }

    void insert(Node n) {
        root = insertRec(root,n);
    }

    Node insertRec(Node root,Node n) {
        if(root==null) {
            root= n;
            return root;
        }
        if(n.val < root.val)
            root.left = insertRec(root.left,n);
        if(n.val > root.val)
            root.right = insertRec(root.right,n);
        return root;
    }

    Node search(Node root, int key){
        if(root==null || root.val==key)
            return root;
        if(key < root.val)
            return search(root.left,key);
        return search(root.right,key);
    }

    void delete(int n){
        root = deleteRec(root,n);
    }

    Node deleteRec(Node root, int n){
        if(root==null)
            return root;
        if(n < root.val)
            root.left = deleteRec(root.left,n);
        if(n> root.val)
            root.right = deleteRec(root.right,n);
        if(n == root.val){
            if(root.left==null)
                return  root.right;
            if(root.right==null)
               return  root.left;
            else {
                root.val = findmin(root.right);
                deleteRec(root.right,root.val);
            }
        }
        return root;
    }

    int findmin(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }

    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(new Node(5));
        b.insert(new Node(4));
        b.inorder();
//        System.out.println(b.search(b.root,6));
        b.delete(4);
        b.inorder();
    }
}
