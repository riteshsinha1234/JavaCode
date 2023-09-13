package AllNewJava.lib.Switch_statement;

import java.util.Scanner;

public class EnhanceSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the fruit name");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please Enter the valid fruit");
        }
    }
}
