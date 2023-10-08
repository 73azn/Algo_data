package DoubleLL.Node;

public class stack {

    T stack = new T();

    void push(int data){
        stack.insertFirst(data);
        stack.displayList();
    }
    int pop(){
        int top = stack.head.data;
        stack.deleteFirst();
        return top;
    }

    void peek(){
        System.out.println(stack.head.data);
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }

    int size(){
        return stack.Count();
    }



}
