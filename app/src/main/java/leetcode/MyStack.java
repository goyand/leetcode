/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

  private Queue<Integer> queue = new ArrayDeque<>();

  public MyStack() {
    // NOP
  }

  public void push(int x) {
    if (queue.isEmpty()) {
      queue.add(x);
      return;
    }

    Queue<Integer> newQueue = new ArrayDeque<>();
    newQueue.add(x);
    while (!queue.isEmpty()) {
      newQueue.add(queue.poll());
    }
    queue = newQueue;
  }

  public int pop() {
    return queue.poll();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}
