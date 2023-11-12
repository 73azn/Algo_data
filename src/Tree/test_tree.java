package Tree;

public class test_tree {

    public static void main(String[] args){

        tree myTree = new tree();

        myTree.insertNode(5);
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(2);
        myTree.insertNode(4);
        myTree.insertNode(1);
        myTree.insertNode(6);
        myTree.insertNode(8);
        System.out.println("tree before deletes");
        myTree.displaybst();
        System.out.println("==========================");
        myTree.deleteNode(5);
        myTree.deleteNode(6);
        myTree.deleteNode(4);
        myTree.deleteNode(2);
        myTree.displaybst();


        myTree.displayDegreeNode(3);

        myTree.In_order_LeftRight();

        myTree.mirror();



    }


}
