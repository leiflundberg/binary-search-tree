class BinaryTree { 
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(6);
        tree.root.right = new Node(7);

    /*
        Tree at this point: 
        
                 5
            /          \
          6             7
        / \            / \
     null null      null null
        
    */
    }
}

class Node {
    int key;
    Node left, right; 

    Node(int i) {
        key = i;
        left = null; 
        right = null;
    }
}
