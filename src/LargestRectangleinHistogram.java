import java.util.Arrays;
import java.util.Scanner;

public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(React(arr, 0));

    }

    static int React(int[] height, int index) {

        if (height.length == index) {

            return 0;
        }
        int leftSum = 0;
        int rightSum = 0;
        int currNumber = height[index];

        int rSteps = 0;
        for (int r = index + 1; r < height.length; r++) {
            if (currNumber <= height[r]) {
                rSteps++;
            } else {
                break;
            }
        }
        rightSum = currNumber * rSteps;

        int lSteps = 1;
        for (int l = index-1; l >= 0; l--) {
            if (currNumber <= height[l]) {
                lSteps++;
            } else {
                break;
            }
        }

        int biggest = 0;
        leftSum = currNumber * lSteps;
          biggest  = leftSum+rightSum;

        int sum =React(height, index + 1);

        return Math.max(sum, biggest);
    }
}
