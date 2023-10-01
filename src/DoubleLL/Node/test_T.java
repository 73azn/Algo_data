package DoubleLL.Node;

public class test_T {

    public static void main(String[] args){

        T myList = new T();


        myList.insertLast(2);
        myList.insertFirst(1);
        myList.insertAfterNode(3,5);
        myList.displayList();
        myList.displayFirst();
        myList.displayTail();
    }


}
