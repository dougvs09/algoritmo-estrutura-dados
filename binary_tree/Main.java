package binary_tree;

import java.util.List;

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
        int number = 11;
        boolean hasInBinaryTree = binaryTree.search(number);
        boolean hasInBinaryTreeDfs = binaryTree.dfsSearch(number);
        boolean hasInBinaryTreeBfs = binaryTree.bfsSearch(number);
        List<Integer> preorderTraversalArr = binaryTree.preorderTraversal();
        List<Integer> inorderTraversalArr = binaryTree.inorderTraversal();
        List<Integer> postorderTraversalArr = binaryTree.postorderTraversal();

        System.out.println(root);
        System.out.printf("The number %d has in binary tree? %b", number, hasInBinaryTree);
        System.out.printf("%nThe number %d has in binary tree? (using dfs search) %b", number, hasInBinaryTreeDfs);
        System.out.printf("%nThe number %d has in binary tree? (using bfs search) %b", number, hasInBinaryTreeBfs);
        System.out.printf("%nThe array searches with preorder traversal %s", preorderTraversalArr.toString());
        System.out.printf("%nThe array searches with inorder traversal %s", inorderTraversalArr.toString());
        System.out.printf("%nThe array searches with postorder traversal %s", postorderTraversalArr.toString());
    }
}
