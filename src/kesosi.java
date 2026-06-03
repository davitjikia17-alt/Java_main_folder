import java.util.Scanner;
import java.util.*;



public class kesosi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


    int student, ID, grade1, grade2, numstudent;
    double average,max;
    System.out.println("enter the childe:");
    student= in.nextInt();
        System.out.println("enter the ID:");
    ID= in.nextInt();
        System.out.println("enter the 2 grades:");
    grade1= in.nextInt();
    grade2= in.nextInt();
    average=(grade1+grade2)/2;
    max=average;
    numstudent=student;
    for(int i=2;i<=32;i++) {
        System.out.println("enter the 2 grades:");
        grade1 = in.nextInt();
        grade2 = in.nextInt();
        average = (grade1 + grade2) / 2;
        ID = in.nextInt();
        if (average > max) {
            max = average;
            numstudent = i;
        }
        System.out.println("the higthest averagr grade is:"+max);
        System.out.println("the student ID is:"+ID);

    }
    }
}
