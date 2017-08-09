/**
 * Created by sanjanamanojkumar on 8/8/17.
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    public static Node merge(Node l1, Node l2) {
        Node h = new Node(0);
        Node current = h;
        while(l1!=null && l2!=null) {
            System.out.println(l1.val+  "  "+l2.val);
            if(l1.val <l2.val) {
                current.next = l1;
                l1=l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if(l1==null)
            current.next = l2;
        else
            current.next = l1;
        return h.next;
    }

    public static void main(String[] args) {
        List l1 = new List(2);
        l1.insertNode(4);
        l1.insertNode(5);
        List l2 = new List(1);
        l2.insertNode(3);
        l2.insertNode(6);
        l2.insertNode(7);
        List r = new List();

        r.head = merge(l1.head,l2.head);
        r.printList();

    }
}
