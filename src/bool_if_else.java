import java.util.Scanner;


public class bool_if_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println(num + " is positive num");

        } else if (num < 0) {
            System.out.println(num + " is negative num");

        }else {
            System.out.println("Num is ZERO!");
        }

        input.close();
    }

}