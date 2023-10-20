package DoubleLL.Node;

public class Queue {
   T Queue = new T();
    //Inserting Start
    public void Enqueue(int element) {
        Queue.insertLast(element);
        Queue.displayList();
        Queue.displayCount();
    }
    public void InsertAfterFirst(int element) {
        Queue.insertAfterFirst(element);
    }
    public void InserBeforeLast(int element) {
        Queue.inserBeforeLast(element);
    }
    public void InsertBeforeNode(int element, int value) {
        Queue.insertBeforeNode(element, value);
    }
    //Inserting End

    //Deleting Start
    public void Dequeue() {
        if(isEmpty()) {
            return ;
        } else {
            Queue.deleteFirst();
            Queue.displayList();
            Queue.displayCount();
        }
    }
    public void DeleteAfterFirst() {
        Queue.deleteAfterFirst();
    }
    public void DeleteAllAfterFirst() {
        Queue.deleteAllAfterFirst();
    }
    public void DeleteBeforeLast() {
        Queue.deleteBeforeLast();
    }
    public void DeleteAllBeforeLast() {
        Queue.deleteAllBeforeLast();
    }


    //Deleting End

    //Traversing Start
    public void Search(int element) {
        Queue.search(element);
    }
    //Traversing end

    public void reverseQueue() {
        Queue.ReverseQueue();
    }
    public void getTop(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        System.out.println("Top = " + Queue.head.data);
    }
    public boolean isEmpty(){
        return Queue.isEmpty();
    }
    public int size(){
        return Queue.Count();
    }


    //Display
//    public void display() {
//        Queue.Display();
//    }
    public void displayList() {
        Queue.displayList();
    }



//    public void reverseQueue() {
//        Queue.ReverseQueue();
//    }
//
//    public int getTail() {
//        return Queue.displayTail();
//    }

//    public void Degueue22 () {
//        Queue.Dequeue2();
//    }




}


