package edu.ttap.trees;

public class Tree<T> {
    private static class Node<T> {
        public T value;
        public Node<T> left;
        public Node<T> right;

        public Node (T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node (T value) {
            this(value, null, null);
        }

        public static <T> Node<T> leaf (T value) {
            return new Node<>(value);
        }
    }

    private Node<T> root;

    public Tree () {
        root = null;
    }

    public Tree<Integer> makeExampleTree() {
        Tree<Integer> tree = new Tree<>();
        tree.root = 
            new Node<>(5, 
                new Node<>(2, 
                    Node.leaf(1),
                    Node.leaf(3)
                ),
                new Node<>(8, 
                    new Node<>(7, 
                        null,
                        Node.leaf(6)
                    ),
                    new Node<>(9, 
                        null,
                        Node.leaf(10)
                    )
                )
            );
        return tree;
    }

    private int sizeH(Node<T> cur) {
        if (cur == null)
            return 0;
        else {
            return 1 + sizeH(cur.left) + sizeH(cur.right);
        }
    }

    public int size() {
        return sizeH(root);
    }
}
