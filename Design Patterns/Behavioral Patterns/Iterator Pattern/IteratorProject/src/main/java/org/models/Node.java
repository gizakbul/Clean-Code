package org.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node<T> {
    public T value;
    public Node<T> left, right, parent;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;

        if (left != null) left.parent = this;
        if (right != null) right.parent = this;
    }

    public Iterator<Node<T>> preOrder() {
        List<Node<T>> result = new ArrayList<>();
        preOrderTraversal(this, result);
        return result.iterator();
    }

    private void preOrderTraversal(Node<T> node, List<Node<T>> result) {
        if (node == null) return;
        result.add(node); // Visit current node
        preOrderTraversal(node.left, result); // Visit left subtree
        preOrderTraversal(node.right, result); // Visit right subtree
    }
}
