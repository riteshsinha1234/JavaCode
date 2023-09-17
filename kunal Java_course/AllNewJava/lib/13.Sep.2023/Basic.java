import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        int BasicSalary = input.nextInt();
        float DearnessSalary = BasicSalary * 40 / 100;
        float HouseSalary = BasicSalary * 20 / 100;
        float GrossSalary = BasicSalary + DearnessSalary + HouseSalary;
        System.out.println("Your BasicSalary is " + BasicSalary);
        System.out.println("Your DearnessSalary  is " + DearnessSalary);
        System.out.println("Your HouseSalary is " + HouseSalary);
        System.out.println("Your GrossSalary is " + GrossSalary);
    }
}