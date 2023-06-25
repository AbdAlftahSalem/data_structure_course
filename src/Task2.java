import java.util.Scanner;

public class Task2 {

    static void examGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("input your grade : ");
        double grade = input.nextDouble();
        if (grade <= 100 && grade >= 85) {
            System.out.println("Your grade is A");
        } else if (grade < 85 && grade >= 75) {
            System.out.println("Your grade is B");
        } else if (grade < 75 && grade >= 65) {
            System.out.println("Your grade is C");
        } else if (grade < 65 && grade >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is E");
        }


    }

}
