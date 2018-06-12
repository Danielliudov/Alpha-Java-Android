import javax.net.ssl.SSLContext;
import java.awt.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;


public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        BigInteger[] num = new BigInteger[input.length];
        for (int i = 0; i <input.length ; i++) {

             num[i] = BigInteger.valueOf(Integer.parseInt(input[i]));

        }
      //  int[] arr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        reverseArray(num,0);
        int sum = 0;
        int messege = 0;


        for (int i = 1; i <=num.length; i++) {

            if(i%2 ==0){

                int parse=num[i-1].intValue();
               sum+=Math.pow(parse,2)*i;
            }
            else{
                int parse1=num[i-1].intValue();
                sum+=(Math.pow(i,2))*parse1;
            }

        }
        String result ="";
        int mSize =sum%10;
        if(sum%10 == 0){
            System.out.println(sum);
            System.out.println("Big Vik wins again!");
        }


        else{
         messege = sum%26;
            int count = 1;
            for (int i = 65+messege; i <= 91; i++) {

                if(count<=mSize && i<=90) {
                   result+= String.valueOf((char) i);
                    count++;
                }
                if (i>90 && count<mSize)
                {
                    i=65;
                    result+= String.valueOf((char) i);
                    count++;
                }
                else if(count>mSize){
                    break;
                }

            }
            System.out.println(sum);
            System.out.println(result);
        }




    }
    public static void reverseArray (BigInteger[] arr, int n){

        if (arr.length / 2 == n) {


            return;
        }

        BigInteger temp =arr[n];
        arr[n] = arr[arr.length-n-1];
        arr[arr.length-n-1] =temp;
        reverseArray(arr, n+1);


    }

}
