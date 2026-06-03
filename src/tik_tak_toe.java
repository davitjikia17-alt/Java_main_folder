import java.util.Scanner;
import java.util.Random;


public class tik_tak_toe {

    static String[][] create_mat() {

        String[][] mat = new String[3][3];

        for (int row = 0; row < 3; row ++){
            for (int col = 0; col < 3; col++){

                mat[row][col] = "+";

            }
        }
        return mat;
    }

    static void printing_mat(String[][] mat) {

        for (int row = 0; row < 3; row++){
            for (int col = 0; col <3; col++){

                if (mat[row][col].equals("O")) {
                    System.out.print("+ ");
                } else{
                    System.out.print(mat[row][col] + " ");

                }
            }
            System.out.println();
        }
    }

    static String[][] compChoose(String[][] mat) {

        Random random = new Random();

        int compRow = random.nextInt(3);
        int compCol = random.nextInt(3);

        while (!mat[compRow][compCol].equals("+")){

            compRow = random.nextInt(3);
            compCol = random.nextInt(3);
        }

        mat[compRow][compCol] = "O";

        return mat;

    }

    static String[][] choose(String[][] mat, Scanner input) {


        System.out.print("enter X coordinates (like: 1,2) : ");
        String userInput = input.next();

        String[] parts = userInput.split(",");

        int userRow = Integer.parseInt(parts[0]) -1;
        int userCol = Integer.parseInt(parts[1]) -1;

        if (mat[userRow][userCol].equals("O")) {

            System.out.println("you have won the game!");

            for (int row = 0; row < 3; row++){
                for (int col = 0; col < 3; col++){

                    System.out.print(mat[row][col] + " ");
                }
                System.out.println();
            }

            System.exit(0);

        }else {
            mat[userRow][userCol] = "X";

        }


        return mat;
    }

    static boolean check_empty_board(String[][] mat) {

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){

                if (mat[row][col].equals("+")){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] mat = create_mat();
        System.out.println("Board: ");
        mat = compChoose(mat);
        printing_mat(mat);

        while (check_empty_board(mat)) {
            System.out.println();

            mat = choose(mat, input);
            System.out.println("Updated board: ");
            printing_mat(mat);

        }
        System.out.println("Board is full!");
    }
}
