public class Pattern8 {
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int val = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    /*
     * Alternate approach
     * static void printPattern(int n) {
     * for (int row = n; row >= 1; row--) {
     * for (int i = n; i > row; i--) {
     * System.out.print(i + " ");
     * }
     * 
     * int totalColsInRow = 2 * row - 1;
     * for (int i = 1; i <= totalColsInRow; i++) {
     * System.out.print(row + " ");
     * }
     * 
     * for (int i = row + 1; i <= n; i++) {
     * System.out.print(i + " ");
     * }
     * System.out.println();
     * }
     * 
     * for (int row = 2; row <= n; row++) {
     * for (int i = n; i > row; i--) {
     * System.out.print(i + " ");
     * }
     * 
     * int totalColsInRow = 2 * row - 1;
     * for (int i = 1; i <= totalColsInRow; i++) {
     * System.out.print(row + " ");
     * }
     * 
     * for (int i = row + 1; i <= n; i++) {
     * System.out.print(i + " ");
     * }
     * System.out.println();
     * }
     * }
     */
}
