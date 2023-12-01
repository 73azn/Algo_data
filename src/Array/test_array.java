package Array;
import java.util.Random;

public class test_array {
    public static void main(String[] args){
        int[] ame = {8,5,9,7,2,3,4};






        Array amer = new Array(ame);

        amer.mergeSort();

        amer.display();


        System.out.println("\n"+ (amer.linerSearch(8)?"found":"not found"));








    }
}
