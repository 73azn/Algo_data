package Tree;
import DoubleLL.Node.Queue;
public class tree {

    node root;




    public void insertNode(int data){
        root = insertNode(root,data);
    }

   private  node insertNode(node node , int data){
        node newNode = new node(data);
        if (node == null){
            if (size() ==0){
                System.out.println(data+" is the root");
            }
            else {
                System.out.println(data+" has inserted");
            }
            node = newNode;
            return node ;
        }

        if (data>= node.data){
            node.right = insertNode(node.right,data);

        }
        else if (data< node.data){
            node.left = insertNode(node.left,data);

        }

        return node;

    }



    public void DisplayRoot(){
        if (root == null){
            System.out.println("there is no root");
            return;
        }
        System.out.println(root);

    }

    //deleting

    void deleteNode(int val){
        if (!search(val)){
            System.out.println("not valid number");
            return;
        }
        root = deleteNode(root,val);
        System.out.println();
    }
    private node deleteNode(node node,int val){
        if (node == null) {


            return node;
        }


        if (val < node.data) node.left = deleteNode(node.left, val);
        else if (val > node.data) node.right = deleteNode(node.right, val);
        else {
            // Node with only one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;


            node.data = findMin(node.right);

            System.out.print(node.data+" are parents of");

            node.right = deleteNode(node.right, node.data);

            if (node.left!=null){
                System.out.print(" "+node.left.data);
            }

            if (node.right!=null){
                System.out.print(" "+ node.right.data);
            }
        }

        return node;

    }



    //printing



    public void displaybst(){
        System.out.println();
        System.out.println("full tree");
        displaybst(root);
        System.out.println();
    }
    public void displaybst(node node){
        if (node!=null){

        System.out.print(node.data+" ");
        displaybst(node.right);
        displaybst(node.left);

        }
    }
    public void displayDegreeNode(int val){
        if (!search(val)){
            System.out.println("value are not valid");
        }
        System.out.println();
        System.out.print("the node ");
        displayDegreeNode(root,val);
        System.out.println();
    }
     void displayDegreeNode(node node,int val){
        if (node == null){
            return;
        }
        if (node.data == val){
         if(node.left != null && node.right != null) {

             System.out.println(node.data + "\nhas 2 degree");
         }
         if(
                 (node.left != null && node.right == null)
                         ||
                         (node.left == null && node.right != null)
         )
         {

             System.out.println(node.data + "\nhas 1 degree");
             return;
         }

         if(node.left == null && node.right == null) {
             System.out.println(node.data + "\nhas 0 degree");
             return;
         }
        }


        displayDegreeNode(node.right,val);
        displayDegreeNode(node.left,val);
    }



    public void DisplayDegree0(){
        System.out.println();
        System.out.println("Degree "+0);

        DisplayDegree0(root);
    }
    private void DisplayDegree0(node node){
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }
        DisplayDegree0(node.left);
        DisplayDegree0(node.right);

    }

    public void DisplayDegree1(){
        System.out.println();
        System.out.println("Degree "+1);

        DisplayDegree1(root);
    }

    private void DisplayDegree1(node node){
        if(node == null) {
            return;
        }

        if(
                (node.left != null && node.right == null)
                                    ||
                (node.left == null && node.right != null)
        )
        {
            System.out.print(node.data + " ");
            return;
        }
        DisplayDegree1(node.left);
        DisplayDegree1(node.right);

    }
    public void DisplayDegree2(){
        System.out.println();
        System.out.println("Degree "+2);

        DisplayDegree2(root);
    }

    private void DisplayDegree2(node node){
        if(node == null) {
            return;
        }
        if(node.left != null && node.right != null) {
            System.out.print(node.data + " ");
        }
        DisplayDegree2(node.left);
        DisplayDegree2(node.right);

    }

    //number of
    void DisplayNumbersOf_LeavesNode(){
        System.out.println("the amount of leaves are : "+ degreeLookup(root,0));
    }
    void DisplayNumberOf_NeitherNode(){
        System.out.println("the amount of Neither node are : "+ degreeLookup(root,1));
    }
    void DisplayNumbersOf_FullNode(){
        System.out.println("the amount of full node are : " + degreeLookup(root,2));
    }


    void DisplayIsBST_fullTree(){
        System.out.println(isBST_fullTree(root));
    }
    boolean isBST_fullTree(node node){

      if (node!= null){

        if(
                (node.left != null && node.right == null)
                        ||
                        (node.left == null && node.right != null)
        )
        {


            return false;
        }
          isBST_fullTree(node.right);
          isBST_fullTree(node.left);

      }


        return true ;







    }

    //traversing


    void mirror(){
        System.out.println("mirror of In order");
        DoubleLL.Node.stack stack = new DoubleLL.Node.stack();
        stack = mirror(root,stack);

        for ( int i = stack.size();i>0; i--){

            System.out.print(stack.Tpop()+" ");
        }

    }


    DoubleLL.Node.stack mirror(node node,DoubleLL.Node.stack stack){
       if (node!= null){
           stack.Tpush(node.data);
           stack = mirror(node.left,stack);
           stack = mirror(node.right,stack);
       }
        return stack;
    }

    void In_order_LeftRight(){
        System.out.println("in order left to right");
        In_order_LeftRight(root);
        System.out.println();
    }
    private void In_order_LeftRight(node node){
        if (node != null){
            System.out.print(node.data+" ");
            In_order_LeftRight(node.left);
            In_order_LeftRight(node.right);
    }



    }
    void In_order_RightLeft(){
        System.out.println("in order Right to left");
        In_order_RightLeft(root);
        System.out.println("");
    }
    private void In_order_RightLeft(node node){
        if (node != null){
        System.out.print(node.data+" ");
        In_order_RightLeft(node.right);
        In_order_RightLeft(node.left);
    }
    }
    void Preorder_LeftRight(){
        Preorder_LeftRight(root);
    }
    private void Preorder_LeftRight(node node){
        if (node != null){
        Preorder_LeftRight(node.left);
        System.out.println(node.data);
        Preorder_LeftRight(node.right);
    }
    }
    void Preorder_RightLeft(){
        Preorder_RightLeft(root);
    }
    private void Preorder_RightLeft(node node){
        if (node != null){
            Preorder_RightLeft(node.right);

        System.out.println(node.data);
        Preorder_RightLeft(node.left);
    }
    }
    void Post_order_LeftRight(){
        Post_order_LeftRight(root);
    }

    private void Post_order_LeftRight(node node){
        if (node!=null){
            Post_order_LeftRight(node.left);
            Post_order_LeftRight(node.right);
            System.out.println(node.data);
        }
    }
    void Post_order_RightLeft(){
        Post_order_RightLeft(root);
    }
    private void Post_order_RightLeft(node node){
        if (node!=null){
            Post_order_RightLeft(node.left);
            Post_order_RightLeft(node.right);
            System.out.println(node.data);
        }
    }
    void Level_order_LeftRight(){

        Queue breath = Level_order_LeftRight(root,new Queue());
        breath.displayList();
    }
    private Queue Level_order_LeftRight(node node , Queue breath){
        if (node != null){
            breath.Enqueue_tree(node.data);
            Level_order_LeftRight(node.left,breath);
            Level_order_LeftRight(node.right,breath);

        }
        return breath;
    }
    void Level_order_RightLeft(){

        Queue breath = Level_order_RightLeft(root,new Queue());
        breath.displayList();
    }
    private Queue Level_order_RightLeft(node node , Queue breath){
        if (node != null){
            breath.Enqueue_tree(node.data);
            Level_order_RightLeft(node.left,breath);
            Level_order_RightLeft(node.right,breath);

        }
        return breath;
    }
    void findMin(){
        System.out.println(findMin(root));
    }
    void findMax(){
        System.out.println(findMax(root));
    }
    int findMin(node node){

        if (node.left == null){
            return node.data;
        }
        return findMin(node.left);
    }
    int findMax(node node){

        if (node.right == null){
            return node.data;
        }
        return findMax(node.right);
    }

    int size(){

        return size(root);

    }
    int size(node node ){

        if (node == null){
            return 0;
        }


     return size(node.left) +1+ size(node.right);

    }
    int sizeLeft(){


        return size(root.left);
    }


    int sizeRight(){

    return size(root.right);

    }



    int numberofEdges(){
        return size()-1;
    }

    boolean search(int val){

    return search(root,val);
    }
    boolean search(node node,int val){
        if (node == null){
            return false;
        }
        if (node.data == val) {
            return true;
        }
        else if (node.data > val) {
            return search(node.left, val);
        }
        else {
            return search(node.right, val);
        }


    }

    private int degreeLookup(node node , int degree){
        if (node == null){
            return 0;
        }



            if (degree == 0){
            if(node.left == null && node.right == null) {

                return 1;
            }
            }



        if(degree == 1){

            if(
                    (node.left != null && node.right == null)
                                       ||
                    (node.left == null && node.right != null)
            )
            {


                return 1;
            }
        }

        if(degree == 2){
            if(node.left != null && node.right != null) {

                return 1;
            }
        }


       return degreeLookup(node.left,degree)+degreeLookup(node.right,degree);

    }







}
