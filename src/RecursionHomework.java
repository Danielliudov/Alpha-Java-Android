import java.util.ArrayList;
import java.util.Scanner;

public class RecursionHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonnaciNumbers.add(0);
        fibonnaciNumbers.add(1);
        fibonnaciNumbers.add(1);
        System.out.println(fibonnaci(10));


    }
   static ArrayList<Integer> fibonnaciNumbers = new ArrayList<>();

    public static int fibonnaci(int n){
        if(n == 0)
        {
            return 0;
        }
        else if (n == 1 || n == 2)
        {
            return 1;
        }
        else{
            if (fibonnaciNumbers.size()>n){
                return fibonnaciNumbers.get(n);
            }
            else{
             int firstNumbers =   fibonnaci(n-1);
               int secondNumbers =  fibonnaci(n-1);
                fibonnaciNumbers.add(firstNumbers+secondNumbers);
                return fibonnaciNumbers.get(n);
            }
        }
    }
}
