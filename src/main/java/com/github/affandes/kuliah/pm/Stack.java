package com.github.affandes.kuliah.pm;

public class Stack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public Node<T> top;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            return null;
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    //cek untuk view
    public T peek() {
        return (top != null) ? top.data : null;
    }
    public boolean isEmpty() {
        return top == null;
    }

    //tampilankan view
    public void printStack() {
        Node<T> current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
