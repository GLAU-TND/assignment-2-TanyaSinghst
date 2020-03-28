package problem4.linked;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }


}
