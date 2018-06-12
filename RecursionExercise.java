import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecursionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(5));

    }

  public static   int factorial(int n){
           if(n ==1) {
               return 1;
           }

               return factorial(n-1)*n;



    }
    public static String reverseWord(String word){

        if(word.length()<2)
        {
         return word;
        }
       int index = word.length()-1;
        return reverseWord(word.substring(1))+word.charAt(0);
    }
      static ArrayList<Integer> fibbonaciMem = new ArrayList<>();
   // public static int fibbonaci(int m){


}
