package DataStructures.Trees.BinaryTree.BinaryTrees.Binary;

public class Tree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);

            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right of " + node.value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        //tree.traverseLevelOrder();
        tree.traverseInOrder(root);
    }

    //output:
    //Binary Tree Example
    //Building tree with root value 5
    //Inserted 2 to left of 5
    //Inserted 4 to right of 2
    //Inserted 8 to right of 5
    //Inserted 6 to right of 5
    //Inserted 7 to right of 5
    //Inserted 3 to right of 2
    //Inserted 9 to right of 5
    //Traversing tree in order
    //2 3 4 5 6 7 8 9

}
