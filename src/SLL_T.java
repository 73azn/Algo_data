public class SLL_T {
    Node head ;
    Node tail;


    /*Inserting start*/
    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail= newNode;

        }
        else {
            newNode.next = head;
            head = newNode;
        }

    }
    /*Inserting end*/

    /*Deleting start*/

    /*Deleting end*/

    /*Printing start*/
    /*Printing end*/

    /*Traversing start*/

    /*Traversing end*/


    private boolean isEmpty(){
        if (head ==null)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
