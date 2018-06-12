import java.util.Scanner;

public class Treining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
         int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
permutation(arr,0);
    }



    static void permutation(int arr[],int n){

        if (arr.length == n)
        {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = n; i < arr.length; i++) {
            swap(arr,i,n);
            permutation(arr,n+1);
            swap(arr,i,n);

        }

    }
    static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
