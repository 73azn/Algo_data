package Tree;
import DoubleLL.Node.Queue;
public class tree {

    node root;
    private int sizeLeft;
   private int sizeRight;



    public void insertNode(int data){
        root = insertNode(root,data);
    }

   private  node insertNode(node node , int data){
        node newNode = new node(data);
        if (node == null){
            node = newNode;
            return node ;
        }

        if (data>= node.data){
            node.right = insertNode(node.right,data);
            sizeRight++;
        }
        else if (data< node.data){
            node.left = insertNode(node.left,data);
            sizeLeft++;
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
    }
    private node deleteNode(node node,int val){
        if (node == null) return node;


        if (val < node.data) node.left = deleteNode(node.left, val);
        else if (val > node.data) node.right = deleteNode(node.right, val);
        else {
            // Node with only one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;


            node.data = findMin(node.right);


            node.right = deleteNode(node.right, node.data);
        }

        return node;

    }



    //printing



    public void displaybst(){
        System.out.println();
        System.out.println("full tree");
        displaybst(root);
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
        displayDegreeNode(root,val,0);
    }
     void displayDegreeNode(node node,int val,int deep){
        if (node == null){
            return;
        }
        if (node.data == val){
            System.out.println("the degree of "+val+" are "+deep);
        }
        displayDegreeNode(node.right,val,deep+1);
        displayDegreeNode(node.left,val,deep+1);
    }


    // this is for you ali i used this method and we can use root.data but i'm trying to understand it
    public void DisplayDegree0(){
        System.out.println();
        System.out.println("Degree "+0);
        DisplayDegree0(root,0);
    }
    private void DisplayDegree0(node node,int deep){
        if (node == null){

            return;
        }

        if (deep == 0){
            System.out.println("Degree "+deep);
            System.out.println(node.data);
            return;
        }
        DisplayDegree0(node.left,deep+1);
        DisplayDegree0(node.right,deep+1);

    }

    public void DisplayDegree1(){
        System.out.println();
        System.out.println("Degree "+1);
        DisplayDegree1(root,0);
    }
    private void DisplayDegree1(node node,int deep){
        if (node == null){

            return;
        }

        if (deep == 1){

            System.out.print(node.data+" ");
            return;
        }
        DisplayDegree1(node.left,deep+1);
        DisplayDegree1(node.right,deep+1);

    }
    public void DisplayDegree2(){
        System.out.println();
        System.out.println("Degree "+2);
        DisplayDegree1(root,0);
    }
    private void DisplayDegree2(node node,int deep){
        if (node == null){

            return;
        }

        if (deep == 2){

            System.out.print(node.data+" ");
            return;
        }
        DisplayDegree2(node.left,deep+1);
        DisplayDegree2(node.right,deep+1);

    }

    //traversing

    void In_order_LeftRight(){
        In_order_LeftRight(root);
    }
    private void In_order_LeftRight(node node){
        if (node != null){
            System.out.println(node.data);
            In_order_LeftRight(node.left);
            In_order_LeftRight(node.right);
    }
    }
    void In_order_RightLeft(){
        In_order_RightLeft(root);
    }
    private void In_order_RightLeft(node node){
        if (node != null){
        System.out.println(node.data);
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
        return this.sizeLeft+this.sizeRight;
    }
    int sizeLeft(){
        return this.sizeLeft;
    }
    int sizeRight(){
        return this.sizeRight-1;
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







}
