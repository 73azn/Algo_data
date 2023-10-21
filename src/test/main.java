package test;
import Array.stack_array;
import SingleLL.Node.Queue;
import SingleLL.Node.T;
import SingleLL.Node.nT;
import SingleLL.Node.stack;
import Array.*;

import java.lang.reflect.Array;

public class main {

    public static void main(String[] args){


    /*for explaining
    *
    * in here only you will find method calls and to see it
    * you will have to go all the way down
    * to see all of the tests
    *
    * the names of the methods are the shortcut of the main class
    *
    * Ex for Single Linked list with no tail named like this (SLLNT)
    *
    * stand for every starting letter
    *
    * */



        System.out.println("==============Single linked list no tail test==============");

        SLLNT();

        System.out.println("==============END==============");

        System.out.println("==============Single linked list  tail test==============");

        SLLT();

        System.out.println("==============END==============");

        System.out.println("==============Single linked list stack test==============");

        SLLS();

        System.out.println("==============END==============");



        System.out.println("==============double linked list  tail test==============");

        DLLT();

        System.out.println("==============END==============");

        System.out.println("==============double linked list  stack test==============");

        DLLS();


        System.out.println("==============END==============");

        System.out.println("==============array stack test==============");

        ARYS();

        System.out.println("==============END==============");

        System.out.println("==============single linked list  queue test==============");

        SLLQ();

        System.out.println("==============END==============");

        System.out.println("==============double linked list  queue test==============");

        DLLQ();

        System.out.println("==============END==============");


    }
    //method for the tests
    //single linked list no tail
   static void SLLNT(){
        SingleLL.Node.nT myList = new SingleLL.Node.nT();

        System.out.println("test 1\n======================================");
        // Test 1: Insert at the beginning
        myList.insertFirst(10);

        myList.displayList(); // Expected output:  10

        // Test 2: Insert at the end
        myList.insertLast(20);
        myList.displayList(); // Expected output:  10 20

        // Test 3: Insert after a specific node
        myList.insertAfterNode(25, 10);
        myList.displayList(); // Expected output: 10 25 20

        // Test 4: Delete first node
        myList.deleteFirst();
        myList.displayList(); // Expected output:  25 20

        // Test 5: Delete last node
        myList.deleteLast();
        myList.displayList(); // Expected output: 25

        // Test 6: Delete after a specific node
        myList.deleteAfterNode(10); //Expected output: there is no number equals 10
        myList.displayList(); // Expected output: 25
        myList.displayFirst();//Expected output: The Head 25
        myList.displayLast();//Expected output: The Tail 25

        // Test 7: Display the first node
        myList.displayFirst(); // Expected output: the head 10

        // Test 8: Display the last node
        myList.displayLast(); // Expected output: the tail 10

        // Test 9: Display the count of nodes
        myList.displayCount(); // Expected output: the number of the nodes are: 1
        System.out.println("======================================");
        System.out.println("test 2\n======================================");
        // Test 10: Display previous and successor nodes
        myList.displayList();
        myList.insertLast(20);
        myList.insertLast(30);
        myList.displayPrvSuss(10);
        // Expected output:
        // you there is no prv
        // the Suss are 20
        myList.displayPrvSuss(20); //
        // Expected output:
        // the prv are 10
        // the Suss are 30
        myList.displayPrvSuss(30);
        // Expected output:
        // the prv are 20
        // no suss in here


        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();// Expected output: the list are empty
        System.out.println("======================================");

        System.out.println("test 3\n======================================");

        myList.insertFirst(1);
        myList.insertAfterNode(2,1);


        myList.displayList();
        myList.displayFirst();
        myList.displayLast();
        System.out.println("======================================");
        // Test 11: Count the number of nodes
        int count = myList.Count();
        System.out.println("Count: " + count); // Expected output: Count: 3

        // Test 12: Check if a specific value exists
        boolean exists = myList.validNum(20);
        System.out.println("Value 20 exists: " + exists); // Expected output: Value 20 exists: true

        // Test 13: Check if a specific value doesn't exist
        exists = myList.validNum(40);
        System.out.println("Value 40 exists: " + exists); // Expected output: Value 40 exists: false

    }

    //single linked list tail

    static void SLLT(){


        T myList = new T();
        System.out.println("test 1\n======================================");
        // Test 1: Insert at the beginning
        myList.insertFirst(10);

        myList.displayList(); // Expected output:  10

        // Test 2: Insert at the end
        myList.insertLast(20);
        myList.displayList(); // Expected output:  10 20

        // Test 3: Insert after a specific node
        myList.insertAfterNode(25, 10);
        myList.displayList(); // Expected output: 10 25 20

        // Test 4: Delete first node
        myList.deleteFirst();
        myList.displayList(); // Expected output:  25 20

        // Test 5: Delete last node
        myList.deleteLast();
        myList.displayList(); // Expected output: 25

        // Test 6: Delete after a specific node
        myList.deleteAfterNode(10); //Expected output: there is no number equals 10
        myList.displayList(); // Expected output: 25
        myList.displayFirst();//Expected output: The Head 25
        myList.displayLast();//Expected output: The Tail 25

        // Test 7: Display the first node


        // Test 9: Display the count of nodes
        myList.displayCount(); // Expected output: the number of the nodes are: 1
        System.out.println("======================================");
        System.out.println("test 2\n======================================");
        // Test 10: Display previous and successor nodes
        myList.displayList();
        myList.insertLast(20);
        myList.insertLast(30);
        myList.displayList();
        myList.displayPrvSuss(10);
        // Expected output:
        // you there is no prv
        // the Suss are 20
        myList.displayPrvSuss(20); //
        // Expected output:
        // the prv are 10
        // the Suss are 30
        myList.displayPrvSuss(30);
        // Expected output:
        // the prv are 20
        // no suss in here


        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();// Expected output: the list are empty
        System.out.println("======================================");

        System.out.println("test 3\n======================================");
        myList.insertFirst(3);

        myList.insertFirst(4);
        myList.insertFirst(5);
        myList.deleteAfterNode(5);
        System.out.println("passed 1");
        myList.displayList();

        myList.deleteAfterNode(5);
        System.out.println("passed 2");


        myList.displayPrvSuss(5);

        System.out.println("passed 3");
        myList.insertLast(3);
        myList.displayPrvSuss(3);
        System.out.println("passed 4");

        myList.displayList();
        myList.insertFirst(1);
        myList.insertAfterNode(2,1);
        myList.insertLast(3);
        myList.displayList();

        myList.displayFirst();
        myList.displayLast();
        System.out.println("======================================");
        // Test 11: Count the number of nodes
        int count = myList.Count();
        System.out.println("Count: " + count); // Expected output: Count: 3

        // Test 12: Check if a specific value exists
        boolean exists = myList.validNum(20);
        System.out.println("Value 20 exists: " + exists); // Expected output: Value 20 exists: true

        // Test 13: Check if a specific value doesn't exist
        exists = myList.validNum(40);
        System.out.println("Value 40 exists: " + exists); // Expected output: Value 40 exists: false
    }










































    //double linked list tail
    static void DLLT(){

        DoubleLL.Node.T myList = new DoubleLL.Node.T();


        System.out.println("test 1\n======================================");
        // Test 1: Insert at the beginning
        myList.insertFirst(10);

        myList.displayList(); // Expected output:  10

        // Test 2: Insert at the end
        myList.insertLast(20);
        myList.displayList(); // Expected output:  10 20

        // Test 3: Insert after a specific node
        myList.insertAfterNode(25, 10);
        myList.displayList(); // Expected output: 10 25 20

        // Test 4: Delete first node09A
        myList.deleteFirst();
        myList.displayList(); // Expected output:  25 20

        // Test 5: Delete last node
        myList.deleteLast();
        myList.displayList(); // Expected output: 25

        // Test 6: Delete after a specific node/'
        myList.deleteAfterNode(10); //Expected output: there is no number equals 10
        myList.displayList(); // Expected output: 25
        myList.displayFirst();//Expected output: The Head 25
        myList.displayTail();//Expected output: The Tail 25

        // Test 7: Display the first node


        // Test 9: Display the count of nodes
        myList.displayCount(); // Expected output: the number of the nodes are: 1
        System.out.println("======================================");
        System.out.println("test 2\n======================================");
        // Test 10: Display previous and successor nodes
        myList.displayList();
        myList.insertLast(20);
        myList.insertLast(30);
        myList.displayList();
        myList.displayPreSuss(10);
        // Expected output:
        // you there is no prv
        // the Suss are 20
        myList.displayPreSuss(20); //
        // Expected output:
        // the prv are 10
        // the Suss are 30
        myList.displayPreSuss(30);
        // Expected output:
        // the prv are 20
        // no suss in here


        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();
        myList.deleteLast();// Expected output: the list are empty
        System.out.println("======================================");

        System.out.println("test 3\n======================================");
        myList.insertFirst(3);

        myList.insertFirst(4);
        myList.insertFirst(5);
        myList.deleteAfterNode(5);
        System.out.println("passed 1");
        myList.displayList();
        myList.displayRevlist();
        myList.deleteAfterNode(5);
        System.out.println("passed 2");


        myList.displayPreSuss(5);

        System.out.println("passed 3");
        myList.insertLast(3);
        myList.displayPreSuss(3);
        System.out.println("passed 4");

        myList.displayList();
        myList.insertFirst(1);
        myList.insertAfterNode(2,1);
        myList.insertLast(3);
        myList.displayList();

        myList.displayFirst();
        myList.displayTail();
        System.out.println("======================================");
        // Test 11: Count the number of nodes
        int count = myList.Count();
        System.out.println("Count: " + count); // Expected output: Count: 3

        // Test 12: Check if a specific value exists
        boolean exists = myList.validNum(20);
        System.out.println("Value 20 exists: " + exists); // Expected output: Value 20 exists: true

        // Test 13: Check if a specific value doesn't exist
        exists = myList.validNum(40);
        System.out.println("Value 40 exists: " + exists); // Expected output: Value 40 exists: false



    }


    //single linked list stack
    static void SLLS(){

        stack myStack = new stack();

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















    //double linked list stack
    static void DLLS(){

        DoubleLL.Node.stack myStack = new DoubleLL.Node.stack();

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

    static void ARYS(){
        stack_array stk = new stack_array(5);
        stk.push(1);
        stk.push(2);
        stk.push(8);
        stk.push(9);

        //shift the data
        stk.insertFirst(2);
        stk.deleteFirst();
        stk.insertFirst(5);

        //pop

        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();

        //repush
        for (int i = 1 ; i<=5 ; i++){
            stk.push(i);
        }

        //repop
        for (int i = 1 ; i<=5 ; i++){
            stk.pop();
        }

        stk.deleteFirst();
        stk.deleteLast();

        stk.insertLast(2);

        stk.displayFirst();
        stk.displayLast();

        stk.peak();

    }


    static void SLLQ(){
        SingleLL.Node.Queue q = new SingleLL.Node.Queue();



        q.Search(4);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.displayList();
        q.getTop();
        q.ReverseQueue();
        q.displayList();
        q.Search(0);
        q.getTop();

    }

    static void DLLQ(){

        DoubleLL.Node.Queue q = new DoubleLL.Node.Queue();



        q.Search(4);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.displayList();
        q.getTop();
        q.ReverseQueue();
        q.displayList();
        q.Search(0);
        q.getTop();

    }

}
