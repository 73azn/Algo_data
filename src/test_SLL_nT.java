public class test_SLL_nT {
    public static void main(String[] args){

        SLL_T node = new SLL_T();
        //the complate test for the methods

        node.insertFirst(25);
        node.insertLast(30);
        node.insertAfterNode(28,25);
        node.insertLast(80);
        node.insertFirst(50);
        //test if the node not in the set
        node.insertAfterNode(29,1);
        node.insertAfterNode(29,8);

        //display the set with all the methods before the deletion
        node.displayList();
        node.displayFirst();
        node.displayLast();
        node.displayCount();

        System.out.println("under here are fixed set");

        //deleting data
        node.deleteFirst();
        node.deleteLast();
        node.deleteAfterNode(25);
        node.deleteAfterNode(30);
        node.deleteAfterNode(28);

        //display the set after the deletion

        node.displayList();
        node.displayFirst();
        node.displayLast();
        node.displayCount();

    }
}
