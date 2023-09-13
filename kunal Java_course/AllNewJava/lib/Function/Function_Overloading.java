

import java.util.Scanner;

public class Function_Overloading {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your Name and age\n");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.println();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.println();
        power(name);
        power(age);
    }

    static void power(int a) {
        // int age = input.nextInt(a);
        System.out.println("Age power method is running");
        System.out.println(a);
    }

    static void power(String n) {
        // String name = input.nextLine();
        System.out.println("Name power method is running");
        System.out.println(n);
    }
}
