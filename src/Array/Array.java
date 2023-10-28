package Array;
public class Array<T>{
    private int[] arr;
    public Array(int[] arr){
        this.arr = arr;
    }
    public SingleLL.Node.T ConvertArrayToSingleLinkedList() {
        SingleLL.Node.T list = new SingleLL.Node.T();
        for(int i : arr) {
            list.insertLast(i);
        }
        return list;
    }

    public DoubleLL.Node.T ConvertArrayToDoubleLinkedList() {
        DoubleLL.Node.T list = new DoubleLL.Node.T();
        for(int i : arr) {
            list.insertLast(i);
        }
        return list;
    }


}
