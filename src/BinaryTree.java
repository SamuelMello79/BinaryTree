/**
 * Represents a Binary Search Tree (BST) in which each node stores
 * an integer value and follows these rules:
 * <ul>
 *     <li>Values smaller than the current node go to the left subtree.</li>
 *     <li>Values greater than or equal to the current node go to the right subtree.</li>
 * </ul>
 *
 * This structure allows efficient search, insertion, and traversal
 * operations with an average complexity of O(log n), assuming the tree
 * remains reasonably balanced.
 */
public class BinaryTree {
    /** The root node of the tree. May be null when the tree is empty. */
    private Node root;

    /**
     * Inserts a new value into the tree.
     * If the tree is empty, the inserted value becomes the new root.
     *
     * @param value the value to be inserted.
     */
    public void insert(int value) {
        root = insertRec(root, value);
    }

    /**
     * Recursive helper method for inserting a value while respecting
     * Binary Search Tree ordering rules.
     *
     * @param current the current node in the recursion.
     * @param value   the value to be inserted.
     * @return the current node after possible modification.
     */
    private Node insertRec(Node current, int value) {
        if (current == null) return new Node(value);
        if (value < current.getValue()) {
            current.setLeft(insertRec(current.getLeft(), value));
        } else {
            current.setRight(insertRec(current.getRight(), value));
        }
        return current;
    }

    /**
     * Checks whether the tree contains the specified value.
     *
     * @param value the value to search for.
     * @return {@code true} if the tree contains the value;
     *         {@code false} otherwise.
     */
    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    /**
     * Recursive helper method for searching a value in the tree.
     *
     * @param current the current node during the search.
     * @param value   the value to search for.
     * @return {@code true} if the value is found; {@code false} otherwise.
     */
    private boolean containsRecursive(Node current, int value) {
        if (current == null) return false;
        if (value == current.getValue()) return true;

        return value < current.getValue()
                ? containsRecursive(current.getLeft(), value)
                : containsRecursive(current.getRight(), value);
    }

    /**
     * Counts how many steps (tree depth levels) are required
     * to reach the specified value during search.
     *
     * @param value the value to search for.
     * @return the number of steps taken until the value is found,
     *         or until a null node is reached if the value does not exist.
     */
    public int countSearchDepth(int value) {
        return countStepsToFind(root, value, 0);
    }

    /**
     * Recursive helper method for counting the number of steps
     * required to find a value in the tree.
     *
     * @param current the current node during the search.
     * @param value   the value being searched.
     * @param steps   the number of steps accumulated so far.
     * @return the total number of steps taken to finish the search.
     */
    private int countStepsToFind(Node current, int value, int steps) {
        if (current == null) return steps;
        if (value == current.getValue()) return steps;

        steps++;
        if (value < current.getValue()) {
            return countStepsToFind(current.getLeft(), value, steps);
        } else {
            return countStepsToFind(current.getRight(), value, steps);
        }
    }

    /**
     * Prints the elements of the tree in pre-order traversal
     * (root → left → right).
     */
    public void preOrder() {
        if (root != null) {
            IO.print("Tree in pre-order: ");
            preOrderRecursive(root);
            IO.println();
        }
    }

    /**
     * Recursive helper method for performing a pre-order traversal.
     *
     * @param current the current node during the traversal.
     */
    private void preOrderRecursive(Node current) {
        if (current != null) {
            IO.print(current.getValue() + " ");
            preOrderRecursive(current.getLeft());
            preOrderRecursive(current.getRight());
            IO.println();
        }
    }
}