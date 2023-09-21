

public class SLL_nT {

  Node head;
  private int count ;

  //under this comment all of it are methods and algorithms

  /* inserting start here*/
  void insertFirst(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      return;
    }

      newNode.next = head;
      head = newNode;


  }

  void insertLast(int data) {
    Node newNode = new Node(data);
    Node cur = head;
    if (isEmpty()){
      head = newNode;
      return;
    }


      while (cur.next != null) {
        cur=cur.next;

      }

      cur.next=newNode;
      cur.next.next=null;




  }

  void insertAfterNode(int data, int Value){
    Node newNode = new Node(data);




    if (isEmpty())
    {
      head = newNode;
      return;
    }

      Node cur = head;

      while(cur!=null && cur.data!=Value){
        cur=cur.next;
      }
      if (cur == null){
        System.out.println("\nNo node with value " + Value + " found.");
      }
      else {
      newNode.next = cur.next;
      cur.next = newNode;
      }
  }

    /*inserting ends here*/






  /*delete start here*/
  void deleteFirst(){

    if (isEmpty()){
      System.out.println("\nthe list are empty");
      return;
    }

      head = head.next;

  }
  void deleteLast(){
    Node cur = head;

    if (isEmpty()){
      System.out.println("\nthe array are empty");
      return;
    }
    if (cur.next == null){
      head=null;
      return;
    }

      while (cur.next.next!=null){cur=cur.next;}

      cur.next = null;


  }
  void deleteAfterNode(int Value) {
    if (isEmpty()) {
      System.out.println("\nEmpty List");
      return;
    }

    Node curr = head;
    while (curr != null && curr.data != Value) {
      curr = curr.next;
    }

    if (curr == null) {
      System.out.println("\nNo node with value " + Value + " found.");
      return;
    }

    if (curr.next == null) {
      System.out.println("\nNo node to delete after " + Value + ".");
    }
    else {
      curr.next = curr.next.next;
    }
  }
  /*delete ends here*/

  /*Printing start here*/
  void displayList(){
    if (isEmpty()){
      System.out.println("\nthe set are Empty");
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
      System.out.println("\nthe set are Empty");
      return;
    }

    System.out.println("\nthe head "+head.data);
  }

  void displayLast(){
    if (isEmpty()){
      System.out.println("\nthe set are Empty");
      return;
    }
    Node cur = head;
    while (cur.next!=null){
      cur = cur.next;

    }
    System.out.println("\nthe tail "+cur.data);
  }

  void displayCount(){
    if (isEmpty()){
      System.out.println("\nthe set are Empty");
      return;
    }
    System.out.println("\nthe number of the nodes are : "+Count());
  }
  void displayPrvSuss(int value){
    Node cur = head;

    if (isEmpty()){
      System.out.println("the set are empty");
      return;
    }


    while (cur.next!=null&&cur.next.data!=value){
      cur=cur.next;
    }
    if (value==head.data){
      System.out.println("you there is no prv");
      if (isHeadEqTail(cur)){
        System.out.println("no suss in here ");
        return;
      }
      System.out.println("the Suss are"+head.next.data);
      return;

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



  /*printing ends here*/

  /*traversing start here*/
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

  /*traversing ends here*/

  /*general method*/

  private boolean isEmpty(){
    if (head ==null)
    {
      return true;
    }

      return false;

  }

  private boolean isHeadEqTail(Node cur){

    if (head == cur){
      return true;
    }


    return false;
  }



}



