package binary_tree;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public BinaryTree(){}

    public TreeNode insert(int value) {
        TreeNode treeNode = new TreeNode(value);

        if (this.root == null) {
            this.root = treeNode;
        } else {
            return this.insert(this.root, treeNode);
        }

        return treeNode;
    }

    private TreeNode insert(TreeNode currentNode, TreeNode newNode) {
        if (newNode.getValue() > currentNode.getValue()) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                this.insert(currentNode.getRight(), newNode);
            }
        }

        if (newNode.getValue() < currentNode.getValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                this.insert(currentNode.getLeft(), newNode);
            }
        }

        return newNode;
    }

    public TreeNode getRoot() {
        return root;
    }
}
