package DoubleLL.Node;

public class test_stack {

    public static void main(String[] args){

        stack myStack = new stack();
        stack st = new stack();

        myStack.push(1);

        myStack.push(2);

        myStack.push(3);

        myStack.pop();
        myStack.reverseStack();

        myStack.peek();

        myStack.reverseStack();

        myStack.push(1);
        myStack.reverseStack();
        myStack.push(2);
        myStack.reverseStack();

        myStack.push(3);

        myStack.pop();
        myStack.reverseStack();


        myStack.peek();


    }

}
