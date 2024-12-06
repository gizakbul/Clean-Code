package org.example;

import org.models.Node;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);
        Node<Integer> root = new Node<>(1, left, right);

        Iterator<Node<Integer>> iterator = root.preOrder();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().value);
        }
    }
}