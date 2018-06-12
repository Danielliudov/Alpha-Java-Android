import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reverseArray(arr,0);
        for (int item:arr
             ) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    

        public static void reverseArray (int[] arr, int n){

            if (arr.length / 2 == n) {


                return;
            }

            int temp =arr[n];
            arr[n] = arr[arr.length-n-1];
            arr[arr.length-n-1] =temp;
            reverseArray(arr, n+1);


        }

    }