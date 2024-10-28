package Page02.Task0232;

import java.util.Stack;

class MyQueue {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> keep = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {// i can not use stack.elementAt(0);
        while (!main.isEmpty()) {
            keep.push(main.pop());
        }
        main.push(x);

        while (!keep.isEmpty()) {
            main.push(keep.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}