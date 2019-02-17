import java.util.Arrays;
import java.util.ArrayList;
public class Basics{
    public void print1To255(){
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOdd1to255(){
        for(int i = 1; i <= 255; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public void printSum(){
        int i = 0;
        int sum = 0;
        while( i < 256){
            sum = sum + i;
            System.out.println("new number : " + i + " Sum: "+ sum);
            i++;
        }
    }
    public void iterArray(int[] arr){
        int[] myArr;
        myArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            
        }
    }
    public void findMax(int[] arr){
        int[] myArr;
        int max = 0;
        myArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void getAvg(int[] arr){
        int[] myArr;
        int sum = 0;
        myArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
            
        }
       int avg = sum/arr.length;
       System.out.println(avg);
    }
    public ArrayList<Integer> arrayOddNum() {
        ArrayList<Integer> myArr= new ArrayList<Integer>();
        for(int i=1; i<=255; i++) {
            if(i%2 !=0) {
                myArr.add(i);
            }
        }
        return myArr;
    }
    public int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int num : arr){
            if(num>y){
                count++;
            }
        }
        return count;
    }
    public int[] squareVals(int[] arr){
        
        for( int i = 0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
            
        }
        return arr;
    }
    
    
}