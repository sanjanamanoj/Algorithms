/**
 * Created by sanjanamanojkumar on 8/8/17.
 *
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {

    public static Node reverse(Node head) {
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        List l = new List(2);
        l.insertNode(3);
        l.insertNode(4);
        l.insertNode(5);
        List n = new List();
        n.head = reverse(l.head);
        n.printList();
    }
}
