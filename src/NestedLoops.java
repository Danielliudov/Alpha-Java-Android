import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int border = Integer.parseInt(scanner.nextLine());
        int[] arr =new int[border];
        Loops(arr,0,1,border);
    }

    static void Loops(int[] arr,int index,int border,int size) {

        if (index == size)
        {
            for (int item:arr
                 ) {
                System.out.print(item+" ");
            }
            System.out.println();
            return;
        }

        for (int i = border; i <=size; i++) {
            arr[index] = i;
            Loops(arr,index+1,border,size);
        }








    }
}
