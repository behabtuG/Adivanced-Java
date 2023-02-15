package Trees.BinaryTree.DeleteaNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    //A binary tree node has key,pointer to left child and a pointer to right child
    static class Node {
        int key;
        Node left, right;

        //Constructor
        Node(int key) {
            this.key = key;
            left = null;
            right = null;

        }
    }

    static Node root;
    static Node temp = root;

    //Inorder traversal of a binary tree
    static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.key + "");
        inorder(temp.right);
    }

    //Function to delete deepest element in binary tree
    static void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;
        //Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode)

                temp = null;
            return;
        }
        if (temp.right != null) {
            if (temp.right == delNode) {
                temp.right = null;
                return;
            } else
                q.add(temp.right);
        }
        if (temp.left != null) {
            if (temp.left == delNode) {
                temp.left = null;
                return;
            } else
                q.add(temp.left);
        }
    }


    //Function to delete given element in binary tree
    static void delete(Node root, int key) {
        if (root == null)
            return;
        if (root.left == null &&
                root.right == null) {
            if (root.key == key) {
                root = null;
                return;
            } else
                return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyNode = null;
        //Do level order traversal until we find key and last node.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.key == key)
                keyNode = temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        if (keyNode != null) {
            int x = temp.key;
            deleteDeepest(root, temp);
            keyNode.key = x;
        }
    }

    //Driver code
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.print("\n Inorder traversal before deletion: ");
        inorder(root);
        //node to delete
        int key = 7;
        delete(root, key);
        System.out.print("\n Inorder traversal after deletion: ");
        inorder(root);

        //output:
        //Inorder traversal before deletion: 7 11 12 10 15 9 8
        //Inorder traversal after deletion: 8 11 12 10 15 9
    }
}
