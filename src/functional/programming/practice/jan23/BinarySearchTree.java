package functional.programming.practice.jan23;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node rootNode = new Node(20);
        insert(12, rootNode);
        insert(34, rootNode);
        insert(65, rootNode);
        insert(23, rootNode);
        inorder(rootNode);
        preorder(rootNode);
        postorder(rootNode);
    }

    //inserting in tree
    public static Node insert(int value, Node current) {
        if (current == null) {
            Node newNode = new Node(value);
            return newNode;
        } else {
            if (value < current.value)
                current.left = insert(value, current.left);
            else
                current.right = insert(value, current.right);
        }
        return current;
    }

    //search in tree
    public static boolean search(int key, Node current) {
        if (current == null)
            return false;
        if (current.value == key)
            return true;
        else {
            if (key < current.value)
                return search(key, current.left);
            else
                return search(key, current.right);
        }
    }

    //preorder traversal: root-left-right
    public static void preorder(Node current) {
        if (current == null)
            return;
        else {
            System.out.print(current.value + " ");
            preorder(current.left);
            preorder(current.right);
        }
        System.out.println();
    }

    //postorder traversal: left-right-root
    public static void postorder(Node current) {
        if (current == null)
            return;
        else {
            postorder(current.left);
            postorder(current.right);
            System.out.print(current.value + " ");
        }
        System.out.println();
    }

    // inorder traversal: left-root-right
    public static void inorder(Node current) {
        if (current == null)
            return;
        else {
            inorder(current.left);
            System.out.print(current.value + " ");
            inorder(current.right);
        }
        System.out.println();
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
