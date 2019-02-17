import java.util.Arrays;
import java.util.ArrayList;
public class Basic13Test{
    public static void main(String[] args){
        Basics basics = new Basics();
        // basics.print1To255();
        // basics.printOdd1to255();
        // basics.printSum();
        int[] x = {1,2,3,4};
        // basics.iterArray(x);
        // System.out.println(Arrays.toString(x));
        // basics.findMax(x);
        // basics.getAvg(x);
        // System.out.println(basics.arrayOddNum());
        // System.out.println(basics.greaterThanY(x, 2));
        basics.squareVals(x);
        System.out.println(Arrays.toString(x));
    }
}