

public class SingleLL_noT {

  SingleNode head;
  int count = 0 ;

  //under this comment all of it are methods and algorithms

  /* inserting start here*/
  void insertFirst(int data) {
    SingleNode newNode = new SingleNode(data);
    if (isEmpty())
      head =  newNode;
    else {
      newNode.next = head;
      head = newNode;
    }

  }

  void insertLast(int data){
    SingleNode newNode = new SingleNode(data);
    SingleNode cur = head;
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
    SingleNode newNode = new SingleNode(data);




    if (isEmpty())
    {
      head = newNode;
    }




    else{
      SingleNode cur = head;

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
    SingleNode cur = head;

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
    SingleNode curr = head;
    while(curr.data != data){
      curr = curr.next;
    }
    curr.next = curr.next.next;
  }
  /*delete ends here*/

  /*Printing start here*/
  void displayList(){
    SingleNode cur = head;
    while (cur!=null){

      System.out.print(cur.data+" ");
      cur=cur.next;

    }




  }
  void displayFirst(){
    System.out.println("the head "+head.data);
  }

  void displayLast(){
    SingleNode cur = head;
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
    SingleNode temp = head;
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



