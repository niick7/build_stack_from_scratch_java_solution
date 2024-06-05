package org.example;

public class Stack {
    private Node first;
    private Node last;
    private int size;

    public Stack() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // Push to the beginning of stack
    public int push(int val) {
        Node newNode = new Node(val);
        if (this.size == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.next = this.first;
            this.first = newNode;
        }
        this.size += 1;
        return this.size;
    }

    // Remove from the beginning of stack
    public Integer pop() {
        if (this.size == 0) {
            return null;
        }

        Node oldFirst = this.first;
        if (this.size == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = oldFirst.next;
        }
        this.size -= 1;

        return oldFirst.value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = this.first;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
