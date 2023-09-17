

public class SingleLL_noT {

  SingleNode head;
  int count = 0 ;

  void insertFirst(int data) {
    SingleNode newNode = new SingleNode(data);
    if (head == null)
      head =  newNode;
    else {
      newNode.next = head;
      head = newNode;
    }

  }

  void insertLast(int data){
    SingleNode newNode = new SingleNode(data);
    SingleNode cur = head;
    if (head == null){
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
    SingleNode cur = head;

    if (head == null)
    {
      head = newNode;
    }
    else{
      while(cur.data!=Value){
        cur=cur.next;
      }
      newNode.next = cur.next;
      cur.next = newNode;



    }
  }
  void printNode(){
    SingleNode cur = head;
    while (cur!=null){

      System.out.print(cur.data+" ");
      cur=cur.next;

    }



  }
  int Count(){
    SingleNode temp = head;
    if (head==null){
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


}