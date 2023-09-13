
public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
        int x;//declare
        x = 40; //initialize
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
