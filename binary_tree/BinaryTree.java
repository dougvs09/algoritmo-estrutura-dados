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
        if (newNode.getValue() < currentNode.getValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                this.insert(currentNode.getLeft(), newNode);
            }
        } else {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                this.insert(currentNode.getRight(), newNode);
            }
        }

        return newNode;
    }

    public boolean search(int value) {
        return this.search(value, this.root);
    }

    private boolean search(int value, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (value == node.getValue()) {
            return true;
        } else if(value < node.getValue()) {
            return this.search(value, node.getLeft());
        } else {
            return this.search(value, node.getRight());
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
