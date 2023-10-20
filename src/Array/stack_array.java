package Array;

import java.util.Arrays;

public class stack_array {

    int top = -1;

    int size;

    int[] stack;

    int count = 0;

    stack_array(int size){
        if(size <= 0) {
            size = 100;
        } else {
            this.size = size;
            stack = new int[size];
        }
    }

    void push(int data){
        if(isFull()) {
            int[] arr = new int[stack.length * 2];
            for(int i=0 ; i<arr.length ; i++) {
                arr[i] = stack[i];
            }
            stack = arr;
        }
        top++;
        stack[top] = data;
        displayStack();
        count++;



    }

    int pop(){
        if (isEmpty()){
            System.out.println("stack are empty");
        }

        int top = stack[this.top];
        stack[this.top] = 0;
        top--;
        displayStack();
        count--;
        return top;
    }

    void displayStack(){
        System.out.println("----");
        for (int i = 0; i<=top ; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println("----");
    }



    boolean isFull(){
        return top == size-1;
    }
    boolean isEmpty(){
        return this.top == -1;
    }

}
