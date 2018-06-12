import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedAreasInAMatrix {
    static ArrayList<Integer> size = new ArrayList();
    static int rowsize;
    static int colSize;
    static ArrayList<Integer> markedPath = new ArrayList<>();
    static ArrayList<Integer> area = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rowsize = Integer.parseInt(scanner.nextLine());
        colSize = Integer.parseInt(scanner.nextLine());
        String[][] labirinth = new String[rowsize][colSize];


        for (int i = 0; i <rowsize ; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j <colSize ; j++) {
               labirinth[i][j]= line[j];
            }

        }



        







    }
























}
