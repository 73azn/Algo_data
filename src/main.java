public class main {
    public static void main(String[] args){


        SingleLL_noT node = new SingleLL_noT();


        node.insertFirst(5);
        node.insertFirst(55);
        node.insertLast(12);
        node.insertLast(13);
        node.insertLast(12);

        node.printNode();
        System.out.println(node.Count());

    }
}
