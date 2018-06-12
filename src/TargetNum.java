import java.util.Arrays;
import java.util.Scanner;

public class TargetNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scanner.nextLine());
        int count = targetNum(0,numbers,0,target);
        System.out.println(count);

    }


    public static int targetNum(int index,int[]number, int current, int target){

        if(index == number.length){
            if(current == target){

                return 1;
            }
            return 0;
        }
        int count = 0;




            count += targetNum(index + 1, number, current + number[index], target);

            count += targetNum(index + 1, number, current - number[index], target);

             count += targetNum(index + 1, number, (current) * (number[index]), target);


        return count;

    }
}
