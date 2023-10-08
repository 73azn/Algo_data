package SingleLL.Node;

public class T {
    Node head ;
    Node tail ;

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
            System.out.println("the set are empty so ("+data+") will be deleted");

            return;
        }
        if (isHeadEqTail()){

            insertLast(newNode.data);
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

        if (isEmpty()){
            System.out.println("\nthe list are empty");
            return;
        }
        if (isHeadEqTail()){
            head = tail= null;

            return;

        }


        Node cur = head;
        for (;cur.next!=tail;cur=cur.next);
        cur.next = null;
        tail=cur;





    }


    void deleteAfterNode(int Value){
        Node curr = head;
        if(isEmpty()){
            System.out.println("\nEmpty List");
            return;
        }


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
            if (curr.next ==tail){
                deleteLast();
                return;
            }

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
        while (cur!=tail.next){

            System.out.print(cur.data+" ");
            cur=cur.next;

        }
        System.out.println();
    }
    void displayFirst(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
            return;
        }
        System.out.println("\nThe Head "+head.data);
    }
    void displayLast(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
            return;
        }
        System.out.println("\nThe Tail "+tail.data);
    }
    void displayCount(){
        System.out.println("\nThe count of the set "+Count());
    }

    void displayPrvSuss(int value){
        Node cur = head;

        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }
        if (isHeadEqTail()){
            System.out.println("no suss in here nor prv");
            return;
        }
        if (value==head.data){

            System.out.println("you there is no prv");

            System.out.println("the Suss are"+head.next.data);
            return;

        }

        while (cur.next!=null&&cur.next.data!=value){
            cur=cur.next;
        }
        if (cur.next==null) {
            System.out.println("\nNo node with value " + value + " found.");
            return;
        }
        System.out.println("the prv are "+cur.data);
        if (cur.next.next ==null){
            System.out.println("the Suss are empty");
            return;
        }
        System.out.println("the Suss are "+cur.next.next.data);
    }

    /*Printing end*/

    /*Traversing start*/
    boolean validNum(int value) {
        Node cur = head;


        while (cur != null) {

            if (cur.data == value) {
                return true;
            }
            cur = cur.next;
        }


        return false;
    }
    int Count(){
        Node cur = head;
        count = 0;
        if (isEmpty()){

            return count;
        }

            while (cur!=null){
                count++;
                cur = cur.next;

            }

            return count;



    }

    /*Traversing end*/


    private boolean isEmpty(){

    return head == null;

    }
    private boolean isHeadEqTail(){
        return head == tail;
    }

}
