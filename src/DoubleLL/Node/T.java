package DoubleLL.Node;

public class T {
    Node head ;
    Node tail;



    //insert start
    void insertFirst(int data){

        Node newNode = new Node(data);
        if (isEmpty()){
            head =tail = newNode;
            return;
        }

        newNode.next = head;
        newNode.next.prv = newNode;
        newNode.prv = null;
        head = newNode;

    }

    void insertLast(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head=tail=newNode;
            return;
        }

        newNode.next = null;
        newNode.prv = tail;
        tail.next = newNode;
        tail = newNode;

    }

    void insertAfterNode(int data, int value){
        Node cur = head;
        Node newNode = new Node(data);
        if (isEmpty()){
            System.out.println("no node with this value "+ value);
            return;
        }

        for (;cur!=null&&cur.data !=value;cur=cur.next);

        if (cur == null){

            System.out.println("no node with this value "+value);
            return;
        }
        if (cur == tail){insertLast(data);
            return;}

        newNode.next = cur.next;
        newNode.prv = cur;
        cur.next.prv = newNode;
        cur.next= newNode;







    }
    //insert end

    //Deleting start
    void deleteFirst (){
        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }
        if (isHeadEqTail()){
            head =tail=null;
            return;
        }
        head = head.next;
        head.prv = null;

    }
    void deleteLast(){
        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }

        if (isHeadEqTail()){
            head =tail=null;
            return;
        }

        tail.prv.next = null;
        tail = tail.prv;


    }
    void deleteAfterNode(int value){
        Node cur = head;
        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }
        for (; cur!= null && cur.data != value;cur = cur.next);

        if (cur == null){
            System.out.println("no node with this value "+ value);
            return;
        }



        if (cur == head){
            cur.next = cur.next.next;
            cur.next.prv = head;
            return;
        }
        if (cur == tail){
            System.out.println("no node after "+ value);
            return;
        }
        if (cur.next == tail){
            deleteLast();
            return;
        }
        if (cur.data == value){
            cur.next = cur.next.next;
            cur.next.prv = cur;

        }
        else {
            System.out.println("error");
        }
    }
    //Deleting end

    //display start
    void displayList(){
        Node cur = head;

        if (isEmpty()){
            return;
        }

        for (;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");}
        System.out.println();




    }
    void displayFirst(){
        if (isEmpty()){

            return;
        }

        System.out.println("The head are "+head.data);
    }


    void displayTail(){

        if (isEmpty()){

            return;
        }

        System.out.println("The Tail are "+tail.data);

    }

    void displayCount(){
        System.out.println("the amount of nodes are "+Count());
    }

    void displayPreSuss(int value){
        Node cur = head;

        for (; cur!=null&&cur.data!= value;cur=cur.next);

        if (cur == null){
            System.out.println("no Node with this Value "+value);
            return;
        }


        if (cur == head){
            System.out.println("there is no pre");
            System.out.println("the suss are "+head.next.data);
            return;
        }
        if (cur == tail){
            System.out.println("the pre are "+ tail.prv.data);
            System.out.println("there is no suss");
            return;
        }
        if (cur.data == value){
            System.out.println("the pre are "+cur.prv.data);
            System.out.println("the suss are "+ cur.next.data);
            return;
        }




        System.out.println("there is an error");



    }
    //display end

    //Traversing start
    int Count (){
        Node cur = head;
        if (isEmpty()){
            return 0;

        }
        int count =0;
        for (;cur != null; cur= cur.next){
            count++;
        }
        return count;
    }
    //Traversing end



    //general methods
    boolean isEmpty(){
        return head == null;
    }

    boolean isHeadEqTail(){

        return head == tail;
    }

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

}


