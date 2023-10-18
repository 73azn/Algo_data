package SingleLL.Node;



public class stack {
    T stack = new T();

    private int P = 0;

    public void push(int data){
        stack.insertFirst(data);
        stack.displayList();
        size();
    }
    public int pop(){
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




    public int peek(){
        if (isEmpty()){
            System.out.println("set are empty");
            return 0;
        }
        int head = stack.head.data;
        System.out.println(head);
        return head;

    }
    boolean isEmpty(){
        return stack.isEmpty();
    }

    int size(){

        int size = stack.Count();
        System.out.println("size: "+size);
        return size;
    }

    public void reverseStack(){
        int size = size();
        System.out.println("======== start rev =========");
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


}
