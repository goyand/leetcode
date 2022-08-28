/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

  private Deque<Integer> stack = new ArrayDeque<>();

  public MyQueue() {

  }

  public void push(int x) {
    Deque<Integer> newStack = new ArrayDeque<>();
    while (!stack.isEmpty()) {
      newStack.push(stack.pop());
    }
    stack.push(x);
    while (!newStack.isEmpty()) {
      stack.push(newStack.pop());
    }
  }

  public int pop() {
    return stack.pop();
  }

  public int peek() {
    return stack.peek();
  }

  public boolean empty() {
    return stack.isEmpty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */