package binary_tree;

import java.util.*;

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
        } else if (value < node.getValue()) {
            return this.search(value, node.getLeft());
        } else {
            return this.search(value, node.getRight());
        }
    }

    public boolean dfsSearch(int value) {
        return this.dfsSearch(value, this.root);
    }

    private boolean dfsSearch(int value, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (value == node.getValue()) {
            return true;
        }

        if (this.dfsSearch(value, node.getLeft())) {
            return true;
        }

        return this.dfsSearch(value, node.getRight());
    }

    public boolean bfsSearch(int value) {
        if (this.root == null) {
            return false;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();

        deque.addLast(root);

        while (!deque.isEmpty()) {
            TreeNode currentNode = deque.removeFirst();

            if (currentNode.getValue() == value) {
                return true;
            }

            if (currentNode.getLeft() != null) {
                deque.addLast(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                deque.addLast(currentNode.getRight());
            }
        }

        return false;
    }

    public List<Integer> preorderTraversal() {
        List<Integer> arr = new ArrayList<>();

        this.preorderTraversal(arr, this.root);

        return arr;
    }

    public List<Integer> inorderTraversal() {
        List<Integer> arr = new ArrayList<>();

        this.inorderTraversal(arr, this.root);

        return arr;
    }

    public List<Integer> postorderTraversal() {
        List<Integer> arr = new ArrayList<>();

        this.postorderTraversal(arr, this.root);

        return arr;
    }

    private void postorderTraversal(List<Integer> arr, TreeNode node) {
        if (node != null) {
            postorderTraversal(arr, node.getLeft());
            postorderTraversal(arr, node.getRight());
            arr.add(node.getValue());
        }
    }

    private void inorderTraversal(List<Integer> arr, TreeNode node) {
        if (node != null) {
            inorderTraversal(arr, node.getLeft());
            arr.add(node.getValue());
            inorderTraversal(arr, node.getRight());
        }
    }

    private void preorderTraversal(List<Integer> arr, TreeNode node) {
        if (node != null) {
            arr.add(node.getValue());
            preorderTraversal(arr, node.getLeft());
            preorderTraversal(arr, node.getRight());
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
