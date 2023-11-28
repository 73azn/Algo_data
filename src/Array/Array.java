package Array;

import java.util.List;

public class Array {
    private int[] arr;
    public Array(int[] arr){
        this.arr = arr;
    }
    public Array(){

    }
    //using binary search
    public boolean isVaild(int number){

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
