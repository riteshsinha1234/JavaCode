package AllNewJava.lib.Switch_statement;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        System.out.println("Enter the Employ Id");
        Scanner input = new Scanner(System.in);
        int empNo = input.nextInt();
        String department = input.next();
        switch (empNo) {
            case 1:
                System.out.println("This is best emaploy");
                break;
            case 2:
                System.out.println("This is Medium emaploy");
                break;
            case 3:
                System.out.println("Employ no. 3");
                switch (department) {
                    case "IT":
                        System.out.println("The is IT department");
                        break;
                    case "CSE":
                        System.out.println("The is CSE department");
                        break;
                    case "Mechinical":
                        System.out.println("The is Mechinical department");
                        break;

                    default:
                        System.out.print("Please select the valid one");
                        break;
                }
                break;
            default:
                System.out.println("Enter the corect value");
        }
    }
}
