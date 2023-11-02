package Array;

import java.util.Arrays;

public class stack_array {

    int top = -1;

    int size;

    int[] stack;



    int count = 0;

    public stack_array(int size){

        this.size = size;
        stack = new int[size];

    }



   public void insertLast(int data){
        push(data);
    }

   public void insertFirst(int data){
        if (isFull()){
            System.out.println("the set are full");
            return;
        }

        int[] temp = new int[size];
        for (int i = 0 ; i<size-1; i++){


            temp[i+1] = stack[i];

        }
        temp[0] = data;

        stack = temp;

        top++;
        count++;

        displayStack();
    }

    public void push(int data){
        if(isFull()) {

            System.out.println("the set are full");
            return;
        }

        top++;
        stack[top] = data;
        count++;

        displayStack();




    }





    public void deleteFirst(){
        if (isEmpty()){
            System.out.println("set are empty");
            return;
        }

        int [] temp = new int[size];
        for (int i = 0 ; i < size-1 ; i++){
            temp[i] = stack[i+1];
        }
        stack = temp;
        top--;
        count--;
        displayStack();
    }
   public void deleteLast(){
        pop();
    }

   public int pop(){
        if (isEmpty()){
            System.out.println("stack are empty");
            return 0 ;
        }



        int top = stack[this.top];
        stack[this.top] = 0;
        this.top--;
        count--;
        displayStack();
        return top;

    }

    //printing start

   public void displayStack(){
        if (isEmpty()){
            System.out.println("set are empty");
            return;
        }
        System.out.println("----");
        for (int i = count-1; i>=0 ; i--){
            System.out.println(stack[i] + " ");
        }
        System.out.println("----");
    }
   public  void displayFirst(){
        if (isEmpty()){
            System.out.println("set are empty");
            return;
        }
        System.out.println(stack[0]);
    }
  public  void displayLast(){
        if (isEmpty()){
            System.out.println("set are empty");
         return;
        }
        peak();
    }

    void displayCount(){
        System.out.println(this.count);
    }

   public int peak(){

        int peak = stack[top];

        System.out.println(peak);

        return peak;

    }



    int Count(){
        return this.count;
    }



    boolean isFull(){
        return top == size-1;
    }
    boolean isEmpty(){
        return this.top == -1;
    }

}
