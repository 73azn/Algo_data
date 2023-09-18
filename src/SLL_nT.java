

public class SLL_nT {

  Node head;
  int count = 0 ;

  //under this comment all of it are methods and algorithms

  /* inserting start here*/
  void insertFirst(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
    }
    else {
      newNode.next = head;
      head = newNode;
    }

  }

  void insertLast(int data){
    Node newNode = new Node(data);
    Node cur = head;
    if (isEmpty()){
      head = newNode;
    }
    else {

      while (cur.next != null) {
        cur=cur.next;

      }

      cur.next=newNode;
      cur.next.next=null;



    }
  }

  void insertAfterNode(int data, int Value){
    Node newNode = new Node(data);




    if (isEmpty())
    {
      head = newNode;
    }




    else{
      Node cur = head;

      while(cur.data!=Value){
        cur=cur.next;
      }
      newNode.next = cur.next;
      cur.next = newNode;
    }
    /*inserting ends here*/




  }

  /*delete start here*/
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
      System.out.println("the array are empty");
    }
    else {
      while (cur.next.next!=null){cur=cur.next;}
      cur.next = null;
    }

  }
  void deleteAfterNode(int data){
    if(head == null){
      System.out.println("Empty List");
    } else if(count == 1){
    }
    Node curr = head;
    while(curr.data != data){
      curr = curr.next;
    }
    curr.next = curr.next.next;
  }
  /*delete ends here*/

  /*Printing start here*/
  void displayList(){
    Node cur = head;
    while (cur!=null){

      System.out.print(cur.data+" ");
      cur=cur.next;

    }




  }
  void displayFirst(){
    System.out.println("the head "+head.data);
  }

  void displayLast(){
    Node cur = head;
    while (cur.next!=null){
      cur = cur.next;

    }
    System.out.println("the tail "+cur.data);
  }

  void displayCount(){
    System.out.println("the number of the nodes are : "+Count());
  }
  /*printing ends here*/

  /*traversing start here*/
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
  /*traversing ends here*/

  /*general method*/

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



