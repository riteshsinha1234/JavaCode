

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 34, 309, 40, 30, 39);// internally store in an Arrays
        fun();// empty array

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));

    }
}