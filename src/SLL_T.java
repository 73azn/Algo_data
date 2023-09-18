public class SLL_T {
    Node head ;
    Node tail;

    int count;


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

    void insertLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head=tail=newNode;
        }
        else {
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        }
    }
    /*Inserting end*/

    /*Deleting start*/

    /*Deleting end*/

    /*Printing start*/
    void displayList(){
        Node cur = head;
        while (cur!=null){

            System.out.print(cur.data+" ");
            cur=cur.next;

        }
    }

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
