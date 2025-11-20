# 📘 Binary Search Tree (BST) in Java
This project implements a Binary Search Tree (BST) in Java, including:
- Node insertion
- Value search
- Pre-order traversal
- Depth counting for search operations
It is a clean, object-oriented, educational implementation suitable for learning recursion, tree structures, and algorithmic reasoning.

## 🌳 Tree Structure
The tree generated in the example program has the following form:

              ┌────────── 8 ──────────┐
              │                        │
        ┌─── 3 ───┐                ┌── 10 ──┐
        │         │                │        │
     ┌─ 1 ─┐   ┌─ 6 ─┐            ▢      ┌─ 14 ─┐
     │     │   │     │                   │      │
     ▢     ▢   ▢     ▢                   ▢      ▢

## 📁 Project Structure
```bash
src/
 ├── BinaryTree.java   # Tree logic (insert, search, traversal)
 ├── Node.java         # Node structure (value, left, right)
 └── Main.java         # Program entry point and example usage
```

## 🚀 Features
✔ Insert values
Maintains BST ordering:
Left subtree: values < parent
Right subtree: values ≥ parent

✔ Search for values
Efficient recursive implementation.

✔ Count steps to find an element
Counts depth levels during the search process.

✔ Pre-order traversal
Outputs:
root → left → right

##  🧠 Example Usage
```java
public static void main() {
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
```

### 📊 Search Depth Example
Searching for value 1 in the example tree:
```bash
Step 0 → node 8  
Step 1 → node 3  
Step 2 → node 1  (found)
```
Output:
```bash
Counting steps to find '1': 2
```

## 🛠️ Technologies Used
- Java 17+
- Recursive algorithms
- Object Oriented Programming (OOP)

## 🤝 Contributions
- Pull requests are welcome!
- Feel free to open issues for improvements, bug reports, or feature requests.
