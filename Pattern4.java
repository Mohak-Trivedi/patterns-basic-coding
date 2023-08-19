public class Pattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = (row < n) ? (row) : (2 * n - row);

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * Alternate approach:
     * static void printPattern(int n) {
     * for (int row = 1; row <= n; row++) {
     * for (int col = 1; col <= row; col++) {
     * System.out.print("* ");
     * }
     * System.out.println();
     * }
     * 
     * for (int row = n - 1; row >= 1; row--) {
     * for (int col = 1; col <= row; col++) {
     * System.out.print("* ");
     * }
     * System.out.println();
     * }
     * }
     */
}
