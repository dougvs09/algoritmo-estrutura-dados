package binary_tree;

public class TreeNode {

    private final int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.toString(new StringBuilder(), true, new StringBuilder(), this).toString();
    }

    private StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb, TreeNode node) {
        if (node.right != null) {
            node.right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb, node.right);
        }

        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(node.value).append("\n");

        if (node.left != null) {
            node.left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb, node.left);
        }

        return sb;
    }
}
