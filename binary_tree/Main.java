package binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new TreeNode(1));

        binaryTree.insert(9);
        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(2);
        binaryTree.insert(-1);
        binaryTree.insert(14);
        binaryTree.insert(11);

        TreeNode root = binaryTree.getRoot();

        System.out.println(root);
    }
}
