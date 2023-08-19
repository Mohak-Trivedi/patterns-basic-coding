public class Pattern7 {
    public static void main(String[] args) {
        printPattern(4);
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

        for (int row = n - 1; row >= 1; row--) {
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
}
