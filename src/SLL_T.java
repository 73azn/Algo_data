public class SLL_T {
    Node head ;
    Node tail;

    private int count;


    /*Inserting start*/
    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail= newNode;
            return;

        }

            newNode.next = head;
            head = newNode;


    }

    void insertLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head=tail=newNode;
            return;
        }

        newNode.next = null;
        tail.next = newNode;
        tail = newNode;

    }

    void insertAfterNode(int data, int Value){
        Node newNode = new Node(data);




        if (isEmpty())
        {
            head = newNode;
            return;
        }

            Node cur = head;
        while(cur!=null&&cur.data!=Value)
        {
            cur=cur.next;
        }
        if (cur==null){
            System.out.println("no value on the sets has "+Value);

            return;
        }

                newNode.next = cur.next;
                cur.next = newNode;

    }


    /*Inserting end*/

    /*Deleting start*/
    void deleteFirst(){

        if (isEmpty()){
            System.out.println("the list are empty");
            return;
        }

            head = head.next;

    }
    void deleteLast(){
        Node cur = head;
    if (isEmpty()){
        System.out.println("\nthe list are empty");
        return;
    }

        while (cur.next!=tail){
            cur=cur.next;
        }
        cur.next = null;
        tail=cur;

    }

    void deleteAfterNode(int Value){
        if(isEmpty()){
            System.out.println("\nEmpty List");
            return;
        }

                Node curr = head;
                while(curr!=null&&curr.data!=Value){
                    curr = curr.next;
                }
                if (curr == null){
                System.out.println("\nthere is no number equals "+Value);
                return;
                }
                if (curr.next == null) {
                    System.out.println("\nthere is nothing after this number "+Value);
                }
                else {


                    curr.next = curr.next.next;

            }
        }



    /*Deleting end*/

    /*Printing start*/
    void displayList(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
            return;
        }
        Node cur = head;
        while (cur!=null){

            System.out.print(cur.data+" ");
            cur=cur.next;

        }
    }
    void displayFirst(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
        }
        System.out.println("\nThe Head "+head.data);
    }
    void displayLast(){
        System.out.println("\nThe Tail "+tail.data);
    }
    void displayCount(){
        System.out.println("\nThe count of the set "+Count());
    }

    /*Printing end*/

    /*Traversing start*/
//    boolean validNum(int value) {
//        Node cur = head;
//
//
//        while (cur != null) {
//
//            if (cur.data == value) {
//                return true;
//            }
//            cur = cur.next;
//        }
//
//
//        return false;
//    }
    int Count(){
        Node temp = head;
        count = 0;
        if (isEmpty()){

            return count;
        }

            while (temp!=null){
                count++;
                temp = temp.next;

            }

            return count;



    }

    /*Traversing end*/


    private boolean isEmpty(){
        if (isEmpty())
        {
            return true;
        }

            return false;

    }

}
