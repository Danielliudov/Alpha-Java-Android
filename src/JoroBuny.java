
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JoroBuny {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int[] steps = Arrays.stream(scanner.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int currCount = 1;
        final int stepsLength = steps.length;
        for (int i = 0; i < stepsLength; i++) {
            for (int j = 1; j < stepsLength + 1; j++) {

                int position = i;
                while (true) {
                    int nextStep = (position + j) % stepsLength;
                    if (steps[nextStep] <= steps[position]) {
                        if (currCount < count) {
                            currCount = count;
                        }
                        count = 1;
                        break;
                    }
                    count++;
                  //  memoryOfSteps.add(position);
                    position = nextStep;
                }
            }
        }
        System.out.println(Math.max(count, currCount));


    }


}
