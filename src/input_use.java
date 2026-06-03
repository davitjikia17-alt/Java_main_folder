import java.util.Scanner;

public class input_use {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your favorite number: ");
        int num = input.nextInt();

        System.out.println("Hello " + name + ". Your favorite number is " + num + "!");
    }
}