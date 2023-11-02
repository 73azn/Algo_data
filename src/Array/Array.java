package Array;

import java.util.List;

public class Array {
    private int[] arr;
    public Array(int[] arr){
        this.arr = arr;
    }
    public Array(){

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




}
