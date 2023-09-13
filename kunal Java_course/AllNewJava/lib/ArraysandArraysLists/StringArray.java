package AllNewJava.lib.ArraysandArraysLists;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        System.out.println("Enter The String Input");
        Scanner input = new Scanner(System.in);// input
        String[] letters = new String[5];// Arrays
        for (int i = 0; i < letters.length; i++) {//letters.length take the length of arrays
            letters[i] = input.nextLine();
        }
        System.out.println();
        System.out.println("This is all letters you choose");
        System.out.println();
        for (String pp : letters) {
            System.out.println(pp + "");
        }
    }
}
