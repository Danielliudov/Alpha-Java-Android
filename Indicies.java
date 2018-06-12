import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Indicies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] arr = new long[(int)n];
        boolean isCycle = false;
        ArrayList<Long> result = new ArrayList<>();
        ArrayList<Long> check = new ArrayList<>();

        for (long i = 0l; i < arr.length; i++) {
            arr[(int)i] = scanner.nextInt();
        }


        long index = 0;
        result.add(0l);
        check.add(0l);

        while (index >= 0 && index <arr.length) {
            index = arr[(int)index];

            if (check.contains(index)) {
                isCycle = true;
                break;
            }
            else if(index> arr.length)
            {
                break;
            }

            result.add(index);
            check.add(index);

        }



        if (isCycle == false) {
            for (long item : result
                    ) {
                System.out.print(item + " ");
            }
        } else {
            System.out.print("0"+"(");
            for (int i = 1; i <check.size();i++) {
                if(i != check.size()-1)
                {
                    System.out.print(check.get(i)+" ");
                }
                else
                {
                    System.out.print(check.get(i));
                }
            }
            System.out.print(")");
        }

    }

}

