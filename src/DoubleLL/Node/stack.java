package DoubleLL.Node;

public class stack {

    T stack = new T();
     private int P = 0;

    void push(int data){
        stack.insertFirst(data);
        stack.displayList();
        size();
    }
    int pop(){
        if (isEmpty()){
            System.out.println("the set are empty");
            return 0 ;
        }

        if (P==1){
            int top = peek();
            stack.deleteFirst();
            return top;

        }

        stack.deleteFirst();
        stack.displayList();
        size();
        return 0;

    }

    int peek(){
        if (isEmpty()){
            System.out.println("set are empty");
            return 0;
        }
        int top = stack.head.data;
        if (P == 1) {


            return top;
        }
        else
            System.out.println(top);
        return 0;
    }

    void reverseStack(){
        int size = size();
        System.out.println("========start rev =========");
        P = 1;
        T temp = new T();


        while (size !=0){

            temp.insertFirst(pop());

            // temp.deleteFirst();

            size--;
        }
        stack = temp;


        P = 0;


        System.out.println("the reversed");
        stack.displayList();



    }

    boolean isEmpty(){
        return stack.isEmpty();
    }

    int size(){

        int size = stack.Count();
        System.out.println("size: "+size);
        return size;
    }



}
