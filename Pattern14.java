public class Pattern14 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = n; row >= 1; row--) {
            for (int i = 1; i <= n - row; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}