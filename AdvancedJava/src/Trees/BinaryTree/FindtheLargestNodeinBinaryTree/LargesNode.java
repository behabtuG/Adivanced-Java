package Trees.BinaryTree.FindtheLargestNodeinBinaryTree;

public class LargesNode {

    //Represent the node of binary tree
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {

            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent the root of binary tree
    public Node root;

    public void LargestNode() {
        root = null;
    }

    //largestElement() will find out the largest node in the binary tree
    public int largestElement(Node temp) {
        //Check whether tree is empty
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftMax, rightMax;
            //Max will store temp's data
            int max = temp.data;
            //it will find element in left subtree
            if (temp.left != null) {
                leftMax = largestElement(temp.left);

                //Compare max with leftMax and store greater value into max
                max = Math.max(max, leftMax);
            }
            //it will find the largest element in right subtree
            if (temp.right != null) {
                rightMax = largestElement(temp.right);

                //Compare max with rightMax and store greater value into max
                max = Math.max(max, rightMax);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        LargesNode bt = new LargesNode();

        //Add nodes to the binary tree
        bt.root = new Node(90);
        bt.root.left = new Node(99);
        bt.root.right = new Node(23);
        bt.root.left.left = new Node(96);
        bt.root.right.left = new Node(45);
        bt.root.right.right = new Node(6);
        bt.root.right.left = new Node(13);
        bt.root.right.right = new Node(77);

        //Display the largest binary tree
        System.out.println("Largest element in the binary tree: " + bt.largestElement(bt.root));


        //output:Largest element in the binary tree: 99
    }
}
