
import java.util.Arrays;
import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int[][] matrix = new int[n][m];
        int result = matrix[0][0];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < m; col++) {
                matrix[row][col] += Math.pow(2, (col + row));


            }

        }
        int rowPosition = 0;
        int colPosition = 0;
        int startIndex = matrix[0][0];
        int rightDown= matrix[rowPosition--][colPosition++];
        int leftDown=matrix[rowPosition--][colPosition--];
        int rightUp=matrix[rowPosition--][colPosition++];
        int leftUp=matrix[rowPosition--][colPosition--];
        while (true) {
            int position = matrix[rowPosition][colPosition];
           /* if (position == startIndex) {
                rowPosition++;
                colPosition++;
            }*/
            if (rowPosition == n-1 && colPosition < n && colPosition > 0) {
                rowPosition--;
                colPosition++;
            } else if (rowPosition == 0 && colPosition < n && colPosition > 0) {
                rowPosition++;
                colPosition--;
            } else if (colPosition == 0 && rowPosition < n && rowPosition > 0) {
                colPosition++;
                rowPosition--;
            } else if (colPosition == m-1 && rowPosition < n&& rowPosition > 0) {
                colPosition--;
                rowPosition--;
            } else if (colPosition < m|| colPosition > 0 || rowPosition < n || rowPosition > 0) {
                colPosition++;
                rowPosition++;
            }
            if       (colPosition == 0 && rowPosition == 0
                    || colPosition == m && rowPosition == 0
                    || colPosition == 0 && rowPosition == n
                    ||colPosition ==m && rowPosition ==n) {
                break;
            }


            result += position;


        }
        System.out.println(result);

    }
}

