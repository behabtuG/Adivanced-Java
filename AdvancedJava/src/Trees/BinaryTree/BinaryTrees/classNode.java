package Trees.BinaryTree.BinaryTrees;

//Represent the node of binary tree
public class classNode {
    int data;
    classNode left;
    classNode right;

    public classNode(int data) {
        //Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
