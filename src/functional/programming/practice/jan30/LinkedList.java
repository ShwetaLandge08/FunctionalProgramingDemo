package functional.programming.practice.jan30;

public class LinkedList {
    private Node head;
    private Node tail;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtTheBeginning(13);
        list.insertAtTheBeginning(14);
        list.insertAtTheBeginning(15);
        list.traverse();
        list.insertAtEnd(23);
        list.insertAtEnd(43);
        list.traverse();
    }

    public void insertAtTheBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void traverse() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + ", ");
            node = node.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
