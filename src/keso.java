import java.util.Scanner;

public class keso {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double rain;
        double max = -1;
        double min = Double.MAX_VALUE;
        int maxYear = 0;
        int minYear = 0;

        for (int i = 1900; i < 1903; i++){
            System.out.print("Enter rain for year " + i + ": ");
            rain = input.nextDouble();

            if (rain > max) {
                max = rain;
                maxYear = i;
            }

            if (rain < min) {
                min = rain;
                minYear = i;
            }
        }

        System.out.println("Max rain: " + max + " in year " + maxYear);
        System.out.println("Min rain: " + min + " in year " + minYear);
    }
}