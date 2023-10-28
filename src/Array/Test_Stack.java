package Array;

public class Test_Stack {
    public static void main(String[] args){
        stack_array stk = new stack_array(5);
        stk.push(1);
        stk.push(2);
        stk.push(8);
        stk.push(9);
        stk.push(9);
        stk.pop();
        stk.deleteFirst();
        stk.push(44);
        stk.push(44);
//
//        //shift the data
//        stk.insertFirst(2);
//        stk.deleteFirst();
//        stk.insertFirst(5);
//
//        //pop
//
//        stk.pop();
//        stk.pop();
//        stk.pop();
//        stk.pop();
//        stk.pop();
//
//        //repush
//        for (int i = 1 ; i<=5 ; i++){
//            stk.push(i);
//        }
//
//        //repop
//        for (int i = 1 ; i<=5 ; i++){
//            stk.pop();
//        }


    }
}
