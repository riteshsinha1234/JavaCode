
import java.util.Arrays;

public class VarArgs_Mix {
    public static void main(String[] args) {
        System.out.println("This is Mix Variable Argument");
        multipleVar(4, 5, 39, 38, 34, 35, 94, 49, 400);
    }

    static void multipleVar(int a, int b, int... arr) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));

    }
}
