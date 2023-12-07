package DoubleLL.Node;

public class Test_Queue {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.Enqueue(5);
        queue.InserBeforeLast(77);
        queue.InserBeforeLast(9);
        queue.InserBeforeLast(80);
        queue.InsertBeforeNode(5,90);

        queue.displayList();
//
        queue.InsertBeforeNode(80,66);
        queue.InsertBeforeNode(80,99);
        queue.DeleteAfterFirst();
        queue.InsertBeforeNode(80,70);
        queue.DeleteAfterFirst();
        queue.InsertBeforeNode(99,70);
        queue.displayList();
//        queue.InsertBeforeNode(90,66);
//        queue.DeleteAllAfterFirst();
        queue.Enqueue(8);
        queue.InsertAfterFirst(80);
        queue.DeleteAllBeforeLast();
        queue.DeleteAllBeforeLast();
        queue.Enqueue(6);
        queue.Enqueue(7);
        queue.Enqueue(8);
        queue.reverseQueue();
        queue.reverseQueue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Search(8);
        queue.displayList();
        queue.Enqueue(5);
        queue.Enqueue(6);
        queue.Enqueue(7);
        int data = queue.DequeueWithReturn();
        System.out.println(data);
        queue.displayList();

    }
}
