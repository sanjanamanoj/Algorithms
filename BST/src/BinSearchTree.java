public class BinSearchTree {
    Node root;

    BinSearchTree(int val){
        this.root = new Node(val);
    }

    public int search(int val){
       return recSearch(this.root,val).val;
    }

    public static Node recSearch(Node root, int val) {
        if(root.val==val || root==null)
            return root;
        if(val <root.val)
            return recSearch(root.left,val);
        return recSearch(root.right,val);
    }

    public  void insert(int val) {
       root =  recInsert(root,val);
    }

    public static Node recInsert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        else if(val < root.val)
            root.left = recInsert(root.left,val);
        else
           root.right =  recInsert(root.right,val);
        return root;
    }

    public void inorder(){
        recInorder(this.root);
    }

    public void recInorder(Node root){
        if(root!=null){
            recInorder(root.left);
            System.out.println(root.val);
            recInorder(root.right);
        }

    }

    public static void main(String[] args){
        BinSearchTree b = new BinSearchTree(5);
        b.insert(6);
        b.insert(4);
        b.inorder();
        System.out.println(b.search(4));
    }
}
