package AllNewJava.lib.Switch_statement;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        System.out.println("Enter The number");
        Scanner input = new Scanner(System.in);
        int date = input.nextInt();

        switch (date) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
