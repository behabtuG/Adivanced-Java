package Trees.BinaryTree.BinaryTrees;

//Then we'll add the starting node of our tree, usually called the root:
public class BinaryTrees {

    Nodes root;

    // ...

    //Inserting Elements
    //Then we'll create a recursive method to do the insertion:
    private Nodes addRecursive(Nodes current, int value) {
        if (current == null) {
            return new Nodes(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    //Next we'll create the public method that starts the recursion from the root node:
    public void add(int value) {
        root = addRecursive(root, value);
    }

    //Let's see how we can use this method to create the tree from our example:
    private BinaryTrees createBinaryTrees() {
        BinaryTrees bt = new BinaryTrees();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    //Finding an Element
    //Now let's add a method to check if the tree contains a specific value.
    //As before, we'll first create a recursive method that traverses the tree:

    private boolean containsNodeRecursive(Nodes current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    //Here we're searching for the value by comparing it to the value in the current node; we'll then continue in the left or right child
    // depending on the outcome.
    //Next we'll create the public method that starts from the root:

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    //All the nodes added should be contained in the tree.
    private Nodes deleteRecursive(Nodes current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;

        /**if (current.left == null && current.right == null) {
         return null;
         }
         if (current.right == null) {
         return current.left;
         }

         if (current.left == null) {
         return current.right;
         }
         */
    }

    private int findSmallestValue(Nodes root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    //int smallestValue = findSmallestValue(current.right);
    //current.value = smallestValue;
    //current.right = deleteRecursive(current.right, smallestValue);
    //return current;

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    //Traversing the Tree
    //Depth-First Search

    //The in-order traversal consists of first visiting the left subtree, then the root node, and finally the right subtree:
    public void traverseInOrder(Nodes node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    // Pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
    public void traversePreOrder(Nodes node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    //Post-order traversal visits the left subtree, the right subt-ree, and the root node at the end:
    public void traversePostOrder(Nodes node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }


}
