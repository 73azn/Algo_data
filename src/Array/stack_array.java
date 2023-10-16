package Array;

public class stack_array {

    int top = -1;

    int size;

    int[] stack;

    int count = 0;

    stack_array(int size){
        this.size =  size;
        stack = new int[size];
    }

    void push(int data){
        if (isFull()){
            System.out.println("max size reached");
            return;
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
        for (int i = size-1; i>=0;i--){
            System.out.println(stack[i]);
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
