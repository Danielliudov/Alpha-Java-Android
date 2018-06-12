import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CorrectBreckets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String expression = "";
        generateExpresion(expression, n);


    }

    static HashSet<String> brackets = new HashSet<>();

    public static HashSet<String> generateExpresion(String expression, int n) {
        if (expression.length() == n) {
            brackets.add(expression);
            System.out.println();
            return brackets;
        }
        HashSet<String> currBrack = generateExpresion(expression + "()", n);
        brackets.addAll(currBrack);

        currBrack = generateExpresion("(" + expression + ")", n);
        brackets.addAll(currBrack);

        currBrack = generateExpresion("()" + expression, n);
        brackets.addAll(currBrack);

        return brackets;

    }

}