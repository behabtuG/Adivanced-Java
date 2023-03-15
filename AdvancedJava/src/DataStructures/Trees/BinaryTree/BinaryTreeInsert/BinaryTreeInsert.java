package DataStructures.Trees.BinaryTree.BinaryTreeInsert;

public class BinaryTreeInsert {
    public static void

    main(String[] args) {
        new BinaryTreeInsert().run();
    }

    static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void run() {
        Node rootnode = new Node(25);
        System.out.println("Building tree with root value" + rootnode.value);
        System.out.println("=================================");
        insert(rootnode, 11);
        insert(rootnode, 15);
        insert(rootnode, 16);
        insert(rootnode, 23);
        insert(rootnode, 79);
    }

    public void insert(Node node, int value) {

        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted" + value + "to left of Node" + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right of Node" + node.value);
                node.right = new Node(value);
            }
        }

        //output:
        // Building tree with root value25
        //=================================
        //Inserted11to left of Node25
        //Inserted 15 to right of Node11
        //Inserted 16 to right of Node15
        //Inserted 23 to right of Node16
        //Inserted 79 to right of Node25
    }
}
