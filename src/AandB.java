import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class AandB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int combinations = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a =arr[0];
        int b = arr[1];
        int[] numbers = new int[combinations];
        variations(a,b,numbers,0);

    }



    static void variations(int a, int b, int[] numbers, int index){
     if (index>numbers.length-1){
         for (int number : numbers) {
             System.out.print(number);
         }
         System.out.println();

      return;
     }
     int max =Math.max(a,b);
     int min = Math.min(a,b);
        for (int i = 0; i <=1 ; i++) {
         if(i==0) {
             numbers[index] = min;


         }
         else{
             numbers[index] = max;

         }
            variations(a, b, numbers, index + 1);

        }


    }

}
