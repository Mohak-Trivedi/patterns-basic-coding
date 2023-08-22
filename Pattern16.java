public class Pattern16 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCols = 2 * row - 1;
            for (int i = 1; i <= n - row; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                if (row < n) {
                    if (col == 1 || col == totalCols) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
