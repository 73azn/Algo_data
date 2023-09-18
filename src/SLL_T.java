public class SLL_T {
    Node head ;
    Node tail;

    int count;


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
        }




        else{
            if (!validNum(Value)){
                System.out.println("there is no number equals "+Value);
            }
            else {
                Node cur = head;

                while(cur.data!=Value){
                    cur=cur.next;
                }
                newNode.next = cur.next;
                cur.next = newNode;
            }
        }
    }


    /*Inserting end*/

    /*Deleting start*/
    void deleteFirst(){

        if (isEmpty()){
            System.out.println("the list are empty");
        }
        else {
            head = head.next;
        }
    }
    void deleteLast(){
        Node cur = head;
    if (isEmpty()){
        System.out.println("the list are empty");
    }
    else {
        while (cur.next!=tail){
            cur=cur.next;
        }
        cur.next = null;
        tail=cur;
    }
    }

    void deleteAfterNode(int Value){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        else {
            if (!validNum(Value)){
                System.out.println("there is no number equals "+Value);
            }


            else {
                Node curr = head;
                while(curr.data != Value){
                    curr = curr.next;
                }
                if (curr.next == null){
                    System.out.println("there is nothing after this number");
                }
                else {
                    curr.next = curr.next.next;
                }
            }
        }
    }

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
        Node temp = head;
        count = 0;
        if (isEmpty()){

            return count;
        }
        else{
            while (temp!=null){
                count++;
                temp = temp.next;

            }

            return count;

        }

    }

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
