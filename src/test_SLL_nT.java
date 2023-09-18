public class test_SLL_nT {
    public static void main(String[] args){


        SLL_nT node = new SLL_nT();



        node.insertFirst(5);
        node.insertFirst(55);
        node.insertLast(12);
        node.insertLast(13);
        node.insertLast(12);

        node.deleteLast();
        node.deleteFirst();

        node.insertAfterNode(1,12);


        node.displayList();

        System.out.println("\nthe number of the nodes "+node.Count());


        node.displayFirst();
        node.displayLast();


        node.displayCount();

        node.insertAfterNode(4,11);
        node.displayList();
    }
}
