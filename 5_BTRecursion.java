package Anant;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class binarytree {
    TreeNode root;

    public int getDifference(TreeNode node, int level) {
        if (node == null) {
            return 0;
        }
        
        // Recursively calculate the difference for the left and right subtrees
        int leftSum = getDifference(node.left, level + 1);
        int rightSum = getDifference(node.right, level + 1);
        
        // If it's an even level, subtract the right subtree sum from the left subtree sum
        // If it's an odd level, subtract the left subtree sum from the right subtree sum
        if (level % 2 == 0) {
            return leftSum - rightSum + node.val;
        } else {
            return rightSum - leftSum + node.val;
        }
    }

    public int getDifferenceBetweenLevels() {
        if (root == null) {
            return 0;
        }
        return getDifference(root, 1); // Start with level 1
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        
        int difference = tree.getDifferenceBetweenLevels();
        System.out.println("The difference between levels is " + difference);
    }
}
