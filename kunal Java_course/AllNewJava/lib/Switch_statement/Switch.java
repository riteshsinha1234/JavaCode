package AllNewJava.lib.Switch_statement;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the fruit name");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please Enter the valid fruit");
        }
    }
}
