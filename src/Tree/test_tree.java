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


        myTree.DisplayDegree0();
        myTree.DisplayDegree1();
        myTree.DisplayDegree2();
        System.out.println();
        System.out.println(myTree.sizeRight());

        myTree.findMin();
        myTree.findMax();
        System.out.println(myTree.numberofEdges());

        myTree.displaybst();

        myTree.displayDegreeNode(8);
        System.out.println(myTree.search(8));
        myTree.Level_order_LeftRight();
        myTree.deleteNode(2);
        myTree.Level_order_LeftRight();

    }


}
