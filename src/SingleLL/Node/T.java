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
        } else {
            Node curr = head;
            while(curr != null) {
                if(curr.next ==null && curr.data != element) {
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

    /*Traversing end*/



     boolean isEmpty(){

    return head == null;

    }
    private boolean isHeadEqTail(){
        return head == tail;
    }

    public void reverseQueue() {
        if (isEmpty() || isHeadEqTail()) {
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



//    public void Enqueue2(int data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            head = tail = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }

//    public void ReverseQueue() {
////         Node curr = head;
////         while(curr != null) {
////             Enqueue2(Dequeue2());
////             curr = curr.next;
////         }
//        stack stk = new stack();
//        Queue queue = new Queue();
//        if (isEmpty()) {
//            System.out.println("Empty list");
//            return;
//        } else {
//            while (!isEmpty()) {
//                stk.push(displayTail());
//                deleteLast();
//            }
//
//            while (!stk.isEmpty()) {
//                queue.Enqueue(stk.peek());
//                stk.pop();
//            }
//        }
//    }
//        public void Display() {
//            if(isEmpty()) {
//                System.out.println("Empty list");
//                return;
//            } else {
//                while(!isEmpty()) {
//                    System.out.print(tail.data + " ");
//                    deleteLast();
//                }
//            }
//        }


//        if(isEmpty()) {
//            System.out.println("Empty list");
//            return;
//        }  else {
//            Node curr = head;
//            while(curr != null) {
//                System.out.print(tail.data + " "); // 5 4 3
//                deleteLast();
//                curr = curr.next;
//            }
//        }

//    public void Enqueue2(int data) {
//         Node newNode = new Node(data);
//         if(isEmpty()) {
//             head = tail = newNode;
//         } else {
//             newNode.next = null;
//             tail.next = newNode;
//             tail = newNode;
//         }
//    }
//    public int Dequeue2() {
//         int prvData;
//         if(isEmpty()) {
//             System.out.println("Empty list");
//             return 0;
//         } else if(head == tail) {
//             prvData = head.data;
//            head = tail = null;
//         } else {
//             prvData = head.data;
//             head = head.next;
//         }
//         return prvData;
//    }
//
//
//
//
//    public int displayTail(){
//        if (isEmpty()){
//            System.out.println("\nthe set are empty");
//            return 0;
//        }
//        return tail.data;
//    }

}