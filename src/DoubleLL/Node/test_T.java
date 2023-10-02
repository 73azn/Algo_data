package DoubleLL.Node;

public class test_T {

    public static void main(String[] args){

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


}
