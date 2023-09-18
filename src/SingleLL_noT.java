

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
  /*delete ends here*/

  /*Printing start here*/
  void printNode(){
    SingleNode cur = head;
    while (cur!=null){

      System.out.print(cur.data+" ");
      cur=cur.next;

    }

    /*printing ends here*/

  }

  /*traversing start here*/
  int Count(){
    SingleNode temp = head;
    if (isEmpty()){
      count = 0;
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
//  My name is Ali


