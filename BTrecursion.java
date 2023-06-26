// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    // The main function that returns the difference between odd and even level nodes
    Node root;

    int getLevelDiff(Node node) {
        // Base case
        if (node == null)
            return 0;

        // Difference for root is root's data - difference for
        // left subtree - difference for right subtree
        return node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);  
        bt.root.right = new Node(3);  
        bt.root.left.left = new Node(4);  
        bt.root.right.left = new Node(5);  
        bt.root.right.right = new Node(6); 
        System.out.println(bt.getLevelDiff(bt.root) +
                " is the required difference");
    }
}
