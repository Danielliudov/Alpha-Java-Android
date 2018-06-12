import java.util.ArrayList;
import java.util.Scanner;

public class NewLabi {
    static ArrayList<String> path = new ArrayList<>();
    static int rowSize;
    static int colSize;
    static ArrayList<String> markedPath = new ArrayList<>();

/// Да питам Стефан защо char не може да бъде зададено с празна сотйност>>>?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rowSize = Integer.parseInt(scanner.nextLine());
        colSize = Integer.parseInt(scanner.nextLine());
        String[][] labirinth = new String[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            String[] row = scanner.nextLine().split("");
            for (int j = 0; j < colSize; j++) {
                labirinth[i][j] = row[j];

            }


        }

        findPath(labirinth,0,0,"");
    }

    static void findPath(String[][] labirinth, int row, int col, String position) {
        if (!isValidPath(row, col))
            return;


        path.add(position);

        if(labirinth[row][col].equals("e")){
            for (String character : path) {
                System.out.print(character);
            }
            System.out.println();
        }

       else if (!isVisited(row, col) && !labirinth[row][col].equals("*")) {
            mark(row, col);
            findPath(labirinth, row + 1, col, "D");
            findPath(labirinth, row - 1, col, "U");
            findPath(labirinth, row, col + 1,  "R");
            findPath(labirinth, row, col - 1,  "L");
            unMark(row, col);


        }

      path.remove(path.size()-1);
    }

    static void mark(int row, int col) {
        markedPath.add(row + " " + col);

    }

    static void unMark(int row, int col) {
        markedPath.remove(row + " " + col);
    } //? Да питам стефан дали намира коя колана и ред са вкарани.

    static boolean isVisited(int row, int col) {
        return (markedPath.contains(row + " " + col));


    }

    static boolean isValidPath(int row, int col) {
        return (row < rowSize && row >= 0 &&
                col < colSize && col >= 0);
    }



}