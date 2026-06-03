import java.util.Scanner;
import java.util.ArrayList;


public class check_symmetry {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list_sensor = new ArrayList<>();

        boolean symmetry = true;
        for (int i = 0; i < 9; i++){

            System.out.print("Enter sensor " + i + "'s num:");
            int sensor = input.nextInt();

            list_sensor.add(sensor);
        }

        for (int i = 0; i < list_sensor.size() /2; i++){
            if (!list_sensor.get(i).equals(list_sensor.get(list_sensor.size() - 1 - i ))){
                symmetry = false;
            }
        }

        System.out.print("your list: " + list_sensor);

        if (symmetry){
            System.out.println("its symmetry");
        }
        else{
            System.out.println("its asymmetry");
        }

        input.close();
    }
}
