package SingleLL.Node;
import SingleLL.Node.stack;
import SingleLL.Node.T;
import SingleLL.Node.Queue;

public class Teset_Queue {

    public static void main(String[] args) {
        Queue q = new Queue();



        q.Search(4);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.displayList();
        q.getTop();
        q.ReverseQueue();
        q.displayList();
        q.Search(0);
        q.getTop();

    }
}
