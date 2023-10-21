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


    public void insertAfterFirst(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            newNode.next = null;
            newNode.prv = head;
            head.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head.next;
        newNode.prv = head;
        head.next.prv = newNode;
        head.next = newNode;
    }

    public void inserBeforeLast(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
         else if(head == tail) {
            newNode.next = head;
            newNode.prv = null;
            head.prv = newNode;
            head = newNode;
            return;
        }
            newNode.next = tail;
            newNode.prv = tail.prv;
             tail.prv.next = newNode;
            tail.prv = newNode;

        }

    public void insertBeforeNode(int element, int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (head.data == element){
            newNode.next = head;
            head.prv = newNode;
            head = newNode;
        } else if(tail.data == element) {
            newNode.next = tail;
            newNode.prv = tail.prv;
            tail.prv.next = newNode;
            tail.prv = newNode;
        } else {
            Node curr = head;
            while (curr != null) {
                  if (curr.data == element) {
                    newNode.next = curr;
                    newNode.prv = curr.prv;
                    curr.prv.next = newNode;
                    curr.prv = newNode;
                    return;
                }
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Not found");
            }
        }
    }
    //insert end

    //Deleting start
    public void deleteFirst(){
        if (isEmpty()){
            System.out.println("the set are empty");
            return;
        }
        if (isHeadEqTail()){
            head = tail = null;
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
            head = tail = null;
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
    public void deleteNode(int value){
        if (isEmpty()){
            System.out.println("set are empty");
            return;
        }
        Node cur = head;
        while (cur != null&&cur.next.data!=value){

            cur = cur.next;
        }
        if (cur == null){
            System.out.println("the number not found");
            return;
        }

        deleteAfterNode(cur.data);

    }


    public void deleteAfterFirst() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if(head == tail) {
            System.out.println("There is no node after head" );
        } else if(head.next == tail) {
            head.next = null;
            tail = head;
        }
        else {
            head.next = head.next.next;
            head.next.next.prv = head;
        }
    }
    public void deleteAllAfterFirst() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if(head == tail) {
            System.out.println("Tere is no node after head");
        } else {
            head.next = null;
            tail = head;
        }
    }
    public void deleteBeforeLast() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if(head == tail) {
            System.out.println("There is no node before tail");
            return;
        } else if (head.next == tail){
            head = tail ;
        } else {
            tail.prv.prv.next = tail;
            tail.prv = tail.prv.prv;
        }
    }
    public void deleteAllBeforeLast() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if(head == tail) {
            System.out.println("There is no node before tail");
            return;
        } else if (head.next == tail){
            head = tail ;
        } else {
            head = tail;
        }

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
    public void search(int element) {
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        } else {
            Node curr = head;
            while(curr != null) {
                if(curr.next == null && curr.data != element) {
                    System.out.println("Not found element " + element);
                    return;
                } else if(curr.data == element){
                    System.out.println("Found it");
                    return;
                }
                curr = curr.next;
            }
            if(curr == null) {
                System.out.println("Not found element " + element);

            }
        }

    }


//    Traversing end
public void ReverseQueue() {
    if (isEmpty()) {
        System.out.println("Empty list");
        return;
    }
    if(isHeadEqTail()) {
        System.out.println("List with only one element");
        return;
    }
    Node curr = head;
    Node prev = null;
    Node nextNode;
    while(curr != null) {
        nextNode = curr.next;
        curr.next = prev;
        curr.prv = nextNode;
        prev = curr;
        curr = nextNode;
    }
    tail = head;
    head = prev;
}


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


