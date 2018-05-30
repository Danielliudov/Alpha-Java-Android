import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String currSub = "";
        String sub = String.valueOf(input.charAt(0));
        int currCount = 0;
        int count = 1;


        for (int i = 0; i <input.length()-1; i++) {
            if (input.valueOf(input.charAt(i)) != input.valueOf(input.charAt(i + 1))) {
                sub += input.valueOf(input.charAt(i + 1));
                count++;


            } else if (currCount < count) {
                currSub = sub;
                currCount = count;
                sub = "";
                count = 1;
            }


        }
       System.out.println(currSub);


    }

}
