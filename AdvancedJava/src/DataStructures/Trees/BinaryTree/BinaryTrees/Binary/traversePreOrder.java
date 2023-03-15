package DataStructures.Trees.BinaryTree.BinaryTrees.Binary;

public class traversePreOrder {
    public static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }
    //output:5 2 4 3 8 6 7 9

    public static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    //output:3 4 2 7 6 9 8 5

    public static void main(String[] args) {
        Node nd = new Node(5);
        nd.left = new Node(2);
        nd.right = new Node(4);
        nd.left.left = new Node(3);
        //5 2 4 3 8 6 7 9
        System.out.println();
        System.out.println();
    }
}
