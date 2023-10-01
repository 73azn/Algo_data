package DoubleLL.Node;

public class T {
    Node head ;
    Node tail;
    //insert
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




    boolean isEmpty(){
        return head == null;
    }

}


