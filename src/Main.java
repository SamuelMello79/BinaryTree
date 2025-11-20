/**
 * Example application demonstrating the use of BinaryTree.
 */
void main() {
    BinaryTree tree = new BinaryTree();

    tree.insert(8);
    tree.insert(3);
    tree.insert(10);
    tree.insert(1);
    tree.insert(6);
    tree.insert(14);

    tree.preOrder();

    IO.println("Search for '1': " + tree.contains(1));
    IO.println("Counting steps to find '1': " + tree.countSearchDepth(1));
}