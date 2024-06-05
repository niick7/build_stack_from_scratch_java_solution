package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);       // Output the stack
        System.out.println(stack.pop()); // Remove and print the top element
    }
}