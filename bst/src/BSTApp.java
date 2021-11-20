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
        if(node == null) {
            return createNewNode(value);
        }
 
        return node;

    }
}

class BinaryTreeApp {
    public static void main(String[] args) {
        System.out.println("Hello Ingrid<3");
        BinaryTree tree = new BinaryTree();
        Node root = null;

        // 100, 35, 120, 10, 40, 110, 140

        tree.insert(root, 100);
    }
}


