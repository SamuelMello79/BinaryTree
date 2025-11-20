/**
 * Represents a node in a Binary Search Tree (BST).
 * Each node stores an integer value and references to its left and right children.
 *
 * <p>Node relationships follow BST rules when inserted through
 * a BinaryTree structure:
 * <ul>
 *     <li>Left child contains a value smaller than this node's value.</li>
 *     <li>Right child contains a value greater than or equal to this node's value.</li>
 * </ul>
 */
public class Node {
    /** The integer value stored in this node. */
    private int value;
    /** Reference to the left child node (maybe null). */
    private Node left;
    /** Reference to the right child node (maybe null). */
    private Node right;

    /**
     * Creates a new node containing the specified integer value.
     *
     * @param value the value to be stored in the node.
     */
    Node(int value) {
        this.value = value;
    }

    /**
     * Returns the value stored in this node.
     *
     * @return the integer value of this node.
     */
    public int getValue() {
        return value;
    }

    /**
     * Updates the value stored in this node.
     *
     * @param value the new integer value.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns the left child of this node.
     *
     * @return the left child node, or {@code null} if none exists.
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Sets the left child of this node.
     *
     * @param left the new left child node (maybe null).
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Returns the right child of this node.
     *
     * @return the right child node, or {@code null} if none exists.
     */
    public Node getRight() {
        return right;
    }

    /**
     * Sets the right child of this node.
     *
     * @param right the new right child node (maybe null).
     */
    public void setRight(Node right) {
        this.right = right;
    }
}
