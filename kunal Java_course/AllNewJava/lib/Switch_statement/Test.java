package AllNewJava.lib.Switch_statement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();

        switch (date) {
            case 1, 2, 3, 4:
                System.out.println("all are in this case");
                break;
            case 5, 6, 7, 8:
                System.out.println("all other are in this case");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }

}