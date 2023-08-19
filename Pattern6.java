public class Pattern6 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            int nspaces = n - row;

            for (int i = 1; i <= nspaces; i++) {
                System.out.print("\t");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + "\t");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    /*
     * ALternate Approach
     * static void printPattern(int n) {
     * for (int row = 1; row <= n; row++) {
     * int nspaces = n - row;
     * int totalColsInRow = 2 * row - 1;
     * int num = row;
     * 
     * for (int i = 1; i <= nspaces; i++) {
     * System.out.print("\t");
     * }
     * for (int col = 1; col <= totalColsInRow; col++) {
     * System.out.print(num + "\t");
     * 
     * num = (col <= totalColsInRow / 2) ? (num - 1) : (num + 1);
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * Alternate approach
     * static void printPattern(int n) {
     * int nspaces = n - 1;
     * int nstars = 1;
     * 
     * for (int row = 1; row <= n; row++) {
     * int num = row;
     * for (int i = 1; i <= nspaces; i++) {
     * System.out.print("\t");
     * }
     * for (int i = 1; i <= nstars; i++) {
     * System.out.print(num + "\t");
     * num = (col <= totalColsInRow / 2) ? (num - 1) : (num + 1);
     * }
     * System.out.println();
     * 
     * nspaces--;
     * nstars += 2;
     * }
     * }
     */
}
