public class Pattern3 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
