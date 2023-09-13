package AllNewJava.lib.ArraysandArraysLists;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        System.out.println("Enter The number");
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();

            }
        }
        System.out.println(" ");
        System.out.println("so This is your output");
        System.out.println(" ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }
    }

}
