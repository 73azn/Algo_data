package Tree;

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
        if (node.data == val){
            return true;
        }
        else if (node.data<=val){
            return search(node.right,val);
        }
        else if (node.data>val){
            return search(node.left,val);
        }

        else {
            return false;
        }

    }



}
