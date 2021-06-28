//14. Implement your own QUEUE using STACKS data structure
package QueueUsingStack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> reverseStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        reverseStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!reverseStack.isEmpty()) {
            stack.push(pop());
        }
        stack.push(x);

        // Pure back
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return reverseStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return reverseStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return reverseStack.isEmpty();
    }

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.push(10);
		mq.push(20);
		mq.push(30);
		mq.push(40);
		mq.push(50);
		mq.push(60);
		mq.push(70);
		mq.push(80);
		System.out.println("Pop the front element:" + mq.pop());
		
		if (!mq.empty()) {
			System.out.println("Queue is not empty");
		}
		
		System.out.println("Peek the front element:" + mq.peek());
	}

}
