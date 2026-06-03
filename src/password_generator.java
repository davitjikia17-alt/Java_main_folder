import java.util.*;
import java.util.Random;


public class password_generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // character sets
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String allChars = upper + lower + numbers + symbols;

        System.out.print("enter password length:");
        int length = input.nextInt();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++){
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("generated password: " + password);

        input.close();

    }
}
