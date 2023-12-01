package Array;


public class Array {
    private int[] arr;
    public Array(int[] arr){
        this.arr = arr;
    }
    public Array(){

    }
    //using binary search
    public boolean BinarySearch(int number){

    if (!isSorted()){

        System.out.println("array aren't sorted");
        return false;

        }
    int first = 0;
    int last = arr.length-1;


    for (;first<=last;){

    int mid = (first + last)/2;





    if (arr[mid]<number){
        first = mid+1;
    }
    else if (arr[mid] == number){
        System.out.println("the number "+number+" are valid");
            return true;
    }
    else {
        last = mid-1;
    }
    }
    if ( first >last ){
            System.out.println("the number "+number+" are invalid !!");
        }
    return false;
    }


    public boolean linerSearch (int key){

        for (int i : arr){
            if (i == key){

                return true;
            }
        }
        return false;
    }

    public int[] getArr(){
        return this.arr;
    }

    public void display(){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }



    public void bubbleSort(){
        for (int i = 0 ; i< arr.length-1;i++){
            for (int j = 0; j < arr.length - 1 - i ;j++){

                if (arr[j]>arr[j+1]){
                    swap(j+1,j);
                }

            }

        }
        System.out.println("sorted by bubble");
    }


    public void insertionSort(){
        for (int i = 1 ; i<arr.length;i++){
            int val = arr[i];
            int j = i-1;
            for (; j>=0&&arr[j]>val;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = val;


        }

        System.out.println("sorted by insertion");
    }

    int partition( int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        swap(i+1,high);

        return i + 1;
    }

    void quickSort(){
        quickSort(0,arr.length-1);
        System.out.println("sorted by Quick");
    }

    void quickSort( int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition( low, high);

            // Recursively sort elements before partition and after partition
            quickSort( low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    public void selectionSort(){
        for (int i = 0 ; i<arr.length-1;i++){
            for (int j = i+1 ; j<arr.length ; j++){

                if (arr[i]>arr[j]){

                    swap(j,i);

                }
            }
        }
        System.out.println("sorted by Selection");
    }

    public void swap(int index1 ,int index2 ){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    public void mergeSort(){
        mergeSort(0,arr.length-1);
        System.out.println("sorted by merge");
    }

    private void mergeSort(int left , int mid , int right){

        int sL = mid-left+1;
        int sR = right-mid;

        int[] L = new int[sL];
        int[] R = new int[sR];


        System.arraycopy(arr,left,L,0,sL);
        System.arraycopy(arr,mid+1,R,0,sR);
/*
* the previous copying method same as this one
*         for (int i = 0 ; i<sL;i++){
            L[i] = arr[i+left];
        }
        for (int i = 0 ; i<sR;i++){
            R[i] = arr[mid+1+i];
        }
* but it's more efficient
*
* because it's from the System class and without looping which it's O(1)
*
* */

        int i = 0, j = 0;

        int k = left;
        while (i < sL && j < sR) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < sL) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < sR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    private void mergeSort(int left , int right){

        if (left<right){

            int mid = (left+right)/2;

            mergeSort(left,mid);
            mergeSort(mid+1,right);

            mergeSort(left,mid,right);
        }







    }

    //under here all of the heaps sorting

    public void heapSort(){
        int size = arr.length-1;
        for (int i = size/2;i>=0;i--){
            heapSort(size,i);
        }
        for (int i =size;i>0;i--){
            swap(0,i);
            heapSort(i,0);
        }
    }

   private void heapSort(int size , int index){


        int bigSelector = index;
        int left = 2*index+1;
        int right = 2*(index+1);

        if (left<size&&arr[left]>arr[bigSelector]){
            bigSelector = left;
        }
        if (right<size&&arr[right]>arr[bigSelector]){
            bigSelector = right;
        }

        if (bigSelector != index){
            swap(bigSelector,index);
            heapSort(size,bigSelector);
        }



   }

   public void heaprev(){
       int size = arr.length-1;
       for (int i = size/2;i>=0;i--){
           heaprev(size,i);
       }
       for (int i =size;i>0;i--){
           swap(0,i);
           heaprev(i,0);
       }
   }
    private void heaprev(int size , int index){


        int smallSelector = index;
        int left = 2*index+1;
        int right = 2*(index+1);

        if (left<size&&arr[left]<arr[smallSelector]){
            smallSelector = left;
        }
        if (right<size&&arr[right]<arr[smallSelector]){
            smallSelector = right;
        }

        if (smallSelector != index){
            swap(smallSelector,index);
            heaprev(size,smallSelector);
        }
    }










    public Object ConvertArrayToLinkedList(int[] arr , String LinkedListType_D_or_S)  {
        LinkedListType_D_or_S = LinkedListType_D_or_S.toUpperCase();
        switch (LinkedListType_D_or_S){

            case "D":
                DoubleLL.Node.T list = new DoubleLL.Node.T();
                for(int i : arr) {
                    list.insertLast(i);
                }
                    return list;
            case "S":
                SingleLL.Node.T slist = new SingleLL.Node.T();
                for(int i : arr) {
                    slist.insertLast(i);
                }

                return slist;
            default : return 0;
        }

    }

    private boolean isSorted(){
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0 ; i<arr.length-1;i++){
          if (arr[i]>arr[i+1]){

              return false;
          }

        }
        return true;
    }




}
