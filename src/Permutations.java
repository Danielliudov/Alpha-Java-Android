import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String[] newArr = new String[arr.length];
        permutation(arr, 0);
    }

    static void permutation(String[] arr, int index) {
        if (index == arr.length-1) {
            for (String x : arr
                    ) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }


        for (int i = index; i < arr.length; i++) {
             swap(arr, index, i);
             permutation(arr, index + 1);
             swap(arr, index, i);

        }
    }

    static void swap(String[] arr, int j, int i) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }
}