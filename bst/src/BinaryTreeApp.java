class Node {
    int key; 
    Node left, right;

    Node(int i) {
        key = i;
        left = null; 
        right = null;
    }
}

class BinaryTree {

    Node createNewNode(int k) {
        Node a = new Node(k);
        return a;
    }

    Node insert(Node node, int value) {
        if(node == null) { return createNewNode(value); }
        if(value < node.key) {
            node.left = insert(node.left, value);
        } else if(value > node.key) {
            node.right = insert(node.left, value);
        }
        return node;

    }

    int smallestValue(Node node) {
        Node current = node; 
        while (current.left != null) {
            current = current.left;
        }
        return (current.key);
    }

    int largestValue(Node node) {
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return (current.key);
    }
}

class BinaryTreeApp {
    public static void main(String[] args) {
        System.out.println("Hello Ingrid<3");
        BinaryTree tree = new BinaryTree();
        Node root = null;

        int values[] = {100, 35, 120, 10, 40, 110, 140};
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
            System.out.println("Added value to the tree: " + values[i]);
        }

        System.out.println("Smallest value of binary search tree is: " + tree.smallestValue(root));
        System.out.println("Largest value of binary search tree is: " + tree.largestValue(root));
    }   
}
