package Array;

public class Array<T>{
    private T[] arr;
    int size = 0;
    public Array(T[] arr){
        this.arr = arr;
    }
    public SingleLL.Node.T ConvertArrayToLinkedList() {
        SingleLL.Node.T list = new SingleLL.Node.T();
        for(T i : arr) {
            list.insertLast((int)i);
        }
        return list;
    }


}
