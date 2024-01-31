package functional.programming.practice.jan30;

public class LinkedList {
    private Node head;
    private Node tail;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtTheBeginning(13);
        list.insertAtTheBeginning(14);
        list.insertAtTheBeginning(15);
        //list.traverse();
    }

    public void insertAtTheBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            newNode = currentNode.getNext();
        }
    }

    public void traverse() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}

class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
