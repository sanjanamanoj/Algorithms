/**
 * Created by sanjanamanojkumar on 8/8/17.
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInLinkedList {

    public static Node delete(Node n) {
        n.val = n.next.val;
        n.next = n.next.next;
        return n;
    }

    public static void main(String[] args) {
        List l = new List(5);
        l.insertNode(6);
        l.insertNode(7);
        delete(l.head);
        l.printList();
    }
}
