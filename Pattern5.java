public class Pattern5 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = (row < n) ? (row) : (2 * n - row);
            int nspaces = n - totalColsInRow;

            for (int i = 1; i <= nspaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * ALternate approach:
     * static void printPattern(int n) {
     * int nspaces = n - 1;
     * int nstars = 1;
     * for (int row = 1; row <= n; row++) {
     * for (int i = 1; i <= nspaces; i++) {
     * System.out.print(" ");
     * }
     * for (int i = 1; i <= nstars; i++) {
     * System.out.print("* ");
     * }
     * System.out.println();
     * 
     * nspaces--;
     * nstars++;
     * }
     * nspaces += 2;
     * nstars -= 2;
     * for (int row = n - 1; row >= 1; row--) {
     * for (int i = 1; i <= nspaces; i++) {
     * System.out.print(" ");
     * }
     * for (int i = 1; i <= nstars; i++) {
     * System.out.print("* ");
     * }
     * System.out.println();
     * 
     * nspaces++;
     * nstars--;
     * }
     * }
     */
}
