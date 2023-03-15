package DataStructures.Trees.BinaryTree.BinaryTreeTraversal;

public class BinaryTreeTraversal {


    //first node
    private Node root;

    BinaryTreeTraversal() {
        root = null;
    }

    //Class representing tree nodes
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void displayData() {
            System.out.print(value + " ");
        }
    }

    public void insert(int i) {
        root = insert(root, i);
    }

    //Inserting node -recursive method
    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        //Move to the left if passed value is
        //less than the current node
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        //Move to the right if passed value is
        //greater than the current node
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    //Search node in binary search tree
    public Node find(int searchedValue) {
        Node current = root;
        while (current.value != searchedValue) {
            if (searchedValue < current.value)
                //Move to the left if searched value is less
                current = current.left;
            else
                //Move to the right if searched value is >=
                current = current.right;
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    //For traversing in order
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }

    //Preorder traversal
    public void preOrder(Node node) {
        if (node != null) {
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //Postorder traversal
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal bst = new BinaryTreeTraversal();
        bst.insert(34);
        bst.insert(56);
        bst.insert(12);
        bst.insert(89);
        bst.insert(67);
        bst.insert(90);
        System.out.println("Inorder traversal of binary tree");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Preorder traversal of binary tree");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree");
        bst.postOrder(bst.root);
        System.out.println();

        //output:
        //Inorder traversal of binary tree
        //12 34 56 67 89 90
        //Preorder traversal of binary tree
        //34 12 56 89 67 90
        //Postorder traversal of binary tree
        //12 67 90 89 56 34
    }
}
