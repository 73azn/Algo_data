public class main {
    public static void main(String[] args){


        SLL_nT node = new SLL_nT();


        node.insertFirst(5);
        node.insertFirst(55);
        node.insertLast(12);
        node.insertLast(13);
        node.insertLast(12);
        node.deleteLast();

        node.deleteFirst();


        node.displayList();

        System.out.println("\nthe number of the nodes "+node.Count());


        node.displayFirst();
        node.displayLast();


        node.displayCount();
    }
}
