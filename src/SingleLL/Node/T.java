package SingleLL.Node;

public class T {
    Node head;
    Node tail;

    private int count;


    /*Inserting start*/
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;


    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = null;
        tail.next = newNode;
        tail = newNode;

    }

    public void insertAfterNode(int data, int Value) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            System.out.println("the set are empty so (" + data + ") will be deleted");

            return;
        }
        if (isHeadEqTail()) {

            insertLast(newNode.data);
            return;
        }

        Node cur = head;

        while (cur != null && cur.data != Value) {
            cur = cur.next;
        }
        if (cur == null) {
            System.out.println("no value on the sets has " + Value);

            return;
        }
        newNode.next = cur.next;
        cur.next = newNode;

    }

    public void insertAfterFirst(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        } else if (head == tail) {
            newNode.next = null;
            head.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public void inserBeforeLast(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if(head == tail) {
        newNode.next = tail;
        head = newNode;
        } else {
            Node curr = head;
            while (curr.next != tail) {
            curr = curr.next;
            }
            newNode.next = tail;
            curr.next = newNode;
        }
    }
    public void insertBeforeNode(int element, int value) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        if (head.data == value){
            newNode.next = head;
            head = newNode;

        } else {
            Node curr = head;
            while (curr != null) {
                if(curr.next == null) {
                    System.out.println("Not found");
                    return;
                } else if (curr.next.data == value) {
                    newNode.next = curr.next;
                    curr.next = newNode;
                    return;
                }
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Not found");
            }
        }
    }



    /*Inserting end*/
    /*Deleting start*/
    public int deleteFirst(){
        if (isEmpty()){
            System.out.println("the list are empty");
            return 0;
        }
        if (isHeadEqTail()){
            head = tail = null;
            return 0;
        }
        int prvH = head.data;
        head = head.next;
        return prvH;
    }
    public void deleteLast(){
        if (isEmpty()){
            System.out.println("\nthe list are empty");
            return;
        }
        if (isHeadEqTail()){
            head = tail = null;
            return;
        }
        Node cur = head;
        for (;cur.next!=tail;cur=cur.next);
        cur.next = null;
        tail=cur;

    }


    public void deleteAfterNode(int Value){
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
            Node curr = head;
            while (curr.next.next != tail) {
                curr = curr.next;
            }
            curr.next = tail;
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
            head.next = tail;
            head = tail;
        }

    }




    /*Deleting end*/
    /*Printing start*/
    public void displayList(){
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
    public void displayFirst(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
            return;
        }
        System.out.println("\nThe Head "+head.data);
    }
    public void displayLast(){
        if (isEmpty()){
            System.out.println("\nthe set are empty");
            return;
        }
        System.out.println("\nThe Tail "+tail.data);
    }
    public void displayCount(){
        System.out.println("The count of the set "+Count() + "\n");
    }

    public void displayPrvSuss(int value){
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
    public int Count(){
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
    public void search(int element) {
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        else {
            Node curr = head;
            while(curr != null) {
                if(curr.next ==null && curr.data != element) {
                    System.out.println("Not found element " + element);
                    return;
                }
                else if(curr.data == element){
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

    /*Traversing end*/



     boolean isEmpty(){

    return head == null;

    }
    private boolean isHeadEqTail(){
        return head == tail;
    }

    public void reverseQueue() {
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
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        tail = head;
        head = prev;
    }

//Recursive

    //Sum recursive method
    public int Sum() {
        int sum = 0;
        Node curr = head;
        return sum(curr, sum);
    }
    private int sum(Node curr, int sum) {
        if(curr == null) {
            return sum;
        } else {
            sum += curr.data;
        }
        return sum(curr.next, sum);
    }

    // max recursive method
    public int max() {
        Node curr = head.next;
        Node max = head;
        return Max(curr, max);
    }
    private int Max(Node curr, Node max) {
        if(curr == null) {
            return max.data;
        } else if(curr.data > max.data) {
            max = curr;
        }
        return Max(curr.next, max);
    }

    //SearchRec recursive method
    public String Searchrec(int element) {
        Node curr = head;
        String exsist = "Not found";
        return searchrec(element, curr, exsist);
    }
    private String searchrec(int element, Node curr, String n) {
        if(curr == null) {
            return n;
        } else if(curr.data == element){
            n = "Found";
        }
        return searchrec(element, curr.next, n);
    }

    //Search5/6 for finding the numbers which are divisible by 5 and 6
    public String Search5_6() {
        Node curr = head;
        String isDivisible = "";
        return search(curr, isDivisible);
    }
    public String search(Node curr, String n) {
        if(curr == null) {
            return n;
        } else if(curr.data % 5 == 0 && curr.data % 6 == 0) {
            n += curr.data + " ";
        }
        return search(curr.next, n);
    }






}