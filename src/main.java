public class main {
    public static void main(String[] args){


        SingleLL_noT node = new SingleLL_noT();


        node.insertFirst(5);
        node.insertFirst(55);
        node.insertLast(12);
        node.insertLast(13);
        node.insertLast(12);
        node.deleteAfterNode(4);



        node.displayList();

        System.out.println("\nthe number of the nodes "+node.Count());


        node.displayFirst();
        node.displayLast();

        node.displayCount();
    }
}
