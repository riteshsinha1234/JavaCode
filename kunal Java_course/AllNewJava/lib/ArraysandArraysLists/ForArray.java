package AllNewJava.lib.ArraysandArraysLists;

import java.util.Scanner;

public class ForArray {
    public static void main(String[] args) {
        System.out.println("Enter Your Input");
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
