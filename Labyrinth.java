
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinth {
    static ArrayList<String> path = new ArrayList<String>();
    static int rowSize;
    static int colSize;
    static ArrayList<String> markedPath = new ArrayList<String>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rowSize = Integer.parseInt(scanner.nextLine());
        colSize = Integer.parseInt(scanner.nextLine());
        String[][] labirinth = new String[rowSize][colSize];

        for (int r = 0; r < rowSize; r++) {
            String[] line = scanner.nextLine().split("");
            for (int c = 0; c < colSize; c++) {
                labirinth[r][c] = line[c];
            }

        }

        FindPath(labirinth, 0, 0, "");
    }

    static void FindPath(String[][] labirinth, int row, int col, String position) {

        if (isPathValid(row, col) && !labirinth[row][col].equals("*")) {
            if (labirinth[row][col].equals("e")) {
                path.add(position);
                for (String s : path) {
                    System.out.print(s + " ");
                }
                System.out.println();
                path.removeAll(path);
                return;
            }


            mark(row, col);
            path.add(position);
            FindPath(labirinth, row + 1, col, position = "D");
            FindPath(labirinth, row - 1, col, position = "U");
            FindPath(labirinth, row, col + 1, position = "R");
            FindPath(labirinth, row, col - 1, position = "L");
            unMarks(row, col);

        }

    }


    static void unMarks(int row, int col) {
        markedPath.remove(row + " " + col);
    }

    static void mark(int row, int col) {
        markedPath.add(row + " " + col);


    }

    static boolean isPathValid(int row, int col) {


        return (!markedPath.contains(row + " " + col) &&
                row < rowSize && row >= 0 &&
                col < colSize && col >= 0);


    }
}