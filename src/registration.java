import java.util.Scanner;
import java.util.ArrayList;

public class registration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean playAgain = true;
        while (playAgain) {

            System.out.println("1 - Register");
            System.out.println("2 - Login");

            System.out.print("Enter: ");
            int choose = input.nextInt();
            input.nextLine();


            if (choose == 1) {
                System.out.print("Enter password to set: ");
                String password = input.nextLine();
                list.add(password);
            }
            else if (choose == 2) {
                System.out.print("Enter password: ");
                String password = input.nextLine();

                if (list.contains(password)){
                    System.out.println("Access granted");
                }
                else{
                    System.out.println("Access denied");
                }
            }
            else {
                System.out.println("Invalid option!");
            }

            System.out.print("Another customer? (yes/no): ");
            String Yn = input.nextLine();

            if (!Yn.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        input.close();
        System.out.println("Have a good day!");
    }
}