/**
 * Created by sanjanamanojkumar on 8/8/17.
 *
 * Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle {

    public static boolean isCyclePresent(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List l = new List(5);
        l.insertNode(6);
        l.insertNode(7);
        System.out.println(isCyclePresent(l.head));

        l.head.next.next.next = l.head;
        System.out.println(isCyclePresent(l.head));


    }
}
