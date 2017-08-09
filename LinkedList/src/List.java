/**
 * Created by sanjanamanojkumar on 8/8/17.
 */
public class List {
    Node head;

    List(){
        this.head= null;
    }

    List(int d) {
        head = new Node(d);
    }

    List(Node n) {
        this.head = n;
    }

    public void insertNode(int d) {
        if(this.head==null)
            this.head = new Node(d);
        else {
            Node current = this.head;
            while(current.next!=null) {
                current = current.next;
            }
            current.next = new Node(d);
        }
    }

    public void printList() {
        Node n = this.head;
        while(n!=null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        List l = new List(5);
        l.insertNode(6);
        l.printList();
    }
}
