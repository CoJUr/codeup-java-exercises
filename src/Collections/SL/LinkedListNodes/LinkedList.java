package Collections.SL.LinkedListNodes;
//each El/node  in the list has data + a pointer to store loc of next node.   last node points to nothing (null pointer)

public class LinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
//            node obj will contain a value field and a next pointer
        }

    }

    Node first = null;

//    now make the corresponding LL class' methods
    public void addAtFront(Node node) {
        node.next = first;
        first = node;
    }
    public void addAtEnd(Node node) {
        if (first == null)
            first = node;
        else {
            Node ptr = first;
            while(ptr.next != null)
                ptr = ptr.next;
            ptr.next = node;
        }
    }

    public void removeFront() {
        first = first.next;
    }
    public void print() {
        Node ptr = first;
        while (ptr != null) {
            System.out.println(ptr.value + " ->");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.addAtFront(new Node(1));
        L.addAtFront(new Node(2));
        L.addAtFront(new Node(4));
        L.addAtFront(new Node(8));
        L.addAtEnd(new Node(5));
        L.print(); //8 -> 4 -> 2 -> 1 -> 5 ->
    }


}
