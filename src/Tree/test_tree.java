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

        //Degree
        myTree.DisplayDegree0();
        myTree.DisplayDegree1();
        myTree.DisplayDegree2();
        System.out.println();

        //Traversing
        System.out.println("\nTraversing");
        myTree.In_order_LeftRight();
        myTree.In_order_RightLeft();
        myTree.Preorder_LeftRight();
        myTree.Preorder_RightLeft();
        myTree.Post_order_LeftRight();
        myTree.Post_order_RightLeft();
        System.out.println("size " + myTree.size());
        System.out.println("right size " +myTree.sizeRight());
        System.out.println("left size " +myTree.sizeLeft());
        System.out.println("Level order right to left");
        myTree.Level_order_RightLeft();


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
