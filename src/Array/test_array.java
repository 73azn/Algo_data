package Array;

public class test_array {
    public static void main(String[] args){
        int[] ame = new int[100];

        for(int i = 0 ; i <= ame.length-1;i++){

            ame[i] = i+1;

        }




        Array amer = new Array(ame);
        System.out.println(amer.isVaild(100)?"Found":"Not Found");



    }
}
