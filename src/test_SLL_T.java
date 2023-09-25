public class test_SLL_T {
    public static void main(String[] args){

        SLL_T node = new SLL_T();
        node.insertFirst(1);
        node.insertLast(2);
        node.insertFirst(0);
        node.insertLast(44);
        node.insertAfterNode(45, 0);
        node.insertAfterNode(50, 2);
        node.deleteAfterNode(44);
        node.deleteLast();
        node.insertFirst(1);





        node.displayPrvSuss(22);
        node.displayCount();
        node.displayFirst();
        node.displayLast();
        node.displayList();

    }
}
