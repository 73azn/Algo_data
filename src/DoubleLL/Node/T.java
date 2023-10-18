package DoubleLL.Node;

public class T {
    Node head ;
    Node tail;



    //insert start
    public void insertFirst(int data){

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

    public void insertLast(int data){
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

    public void insertAfterNode(int data, int value){
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
        if (cur == tail){
            insertLast(data);
            return;}

        newNode.next = cur.next;
        newNode.prv = cur;
        cur.next.prv = newNode;
        cur.next= newNode;







    }
    //insert end

    //Deleting start
    public void deleteFirst(){
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
    public void deleteLast(){
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
    public void deleteAfterNode(int value){
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

        if (cur.next == tail){
            deleteLast();
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

        if (cur.data == value){
            cur.next = cur.next.next;
            cur.next.prv = cur;

        }
        else {
            System.out.println("error");
        }
    }
    public void deleteNode(int index){
        if (isEmpty()){
            System.out.println("set are empty");
            return;
        }

        int count = Count();
        if (index == 0){
            deleteFirst();
            return;
        }
        if (count == index+1){
            deleteLast();
            return;
        }

        Node cur = head;

        for (int i = 0 ; cur != null && i != index;i++){
            cur = cur.next;
        }
        if (cur==null){
            System.out.println("index outbound");
            return;
        }


        cur.data = cur.next.data;
        cur.next = cur.next.next;

    }
    //Deleting end

    //display start
    public void displayList(){
        Node cur = head;

        if (isEmpty()){
            return;
        }

        for (;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");}
        System.out.println();




    }
    public void displayFirst(){
        if (isEmpty()){

            return;
        }

        System.out.println("The head are "+head.data);
    }


    public void displayTail(){

        if (isEmpty()){

            return;
        }

        System.out.println("The Tail are "+tail.data);

    }

    public void displayCount(){
        System.out.println("the amount of nodes are "+Count());
    }

    public void displayPreSuss(int value){
        Node cur = head;

        for (; cur!=null&&cur.data!= value;cur=cur.next);

        if (cur == null){
            System.out.println("no Node with this Value "+value);
            return;
        }


        if (cur.next != null & cur.prv != null){
            System.out.println("the prv are "+cur.prv.data);
            System.out.println("the suss are "+cur.next.data);
            return;
        }
        if (cur.prv == null&cur.next != null){
            System.out.println("no prv");
            System.out.println("the suss are "+cur.next.data);
            return;

        }
        if (cur.next == null&cur.prv!=null){
            System.out.println("the prv are "+cur.prv.data);
            System.out.println("no suss");
            return;
        }

        System.out.println("there is no prv or suss");

}

    public void displayRevlist(){
        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }
        Node cur = tail;

        for (;cur!= null;cur=cur.prv){
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }
    //display end

    //Traversing start
    public int Count(){
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

    public boolean validNum(int value) {
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

