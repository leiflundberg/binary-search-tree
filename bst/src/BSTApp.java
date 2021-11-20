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

        if(value < node.key) {
            node.left = insert(node.left, value);
        } else if(value > node.key) {
            node.right = insert(node.left, value);
        }
 
        return node;

    }

    void printTree(Node node, String prefix) {
        if (node == null) return;

        System.out.println(prefix + "+ " + node.key);
        printTree(node.left, prefix);
        printTree(node.right, prefix);
    }
}

class BinaryTreeApp {
    public static void main(String[] args) {
        System.out.println("Hello Ingrid<3");
        BinaryTree tree = new BinaryTree();
        Node root = null;

        // 100, 35, 120, 10, 40, 110, 140
        root = tree.insert(root, 100);
        root = tree.insert(root, 35);
        root = tree.insert(root, 120);
        root = tree.insert(root, 10);
        root = tree.insert(root, 40);
        root = tree.insert(root, 110);
        root = tree.insert(root, 140);
        
        tree.printTree(root, "");
    }   
}


