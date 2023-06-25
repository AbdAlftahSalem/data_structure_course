import java.util.Scanner;

public class Task1 {

    static Scanner input = new Scanner(System.in);

    static void inputData() {

        System.out.println("Input your name : ");
        String name = input.next();

        System.out.println("Input your age : ");
        double age = Double.parseDouble(input.next());

        System.out.println("Input your height : ");
        String height = input.next();


        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your height is : " + height);


    }


}
