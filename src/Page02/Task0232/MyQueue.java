package Page02.Task0232;

import java.util.Stack;

class MyQueue {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> keep = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        while(!main.empty()){
            keep.push(main.pop());
        }
        main.push(x);
        while(!keep.empty()){
            main.push(keep.pop());
        }
    }

    public int pop() {// i can not use stack.elementAt(0);
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.empty();
    }
}