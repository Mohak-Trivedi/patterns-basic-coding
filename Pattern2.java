public class Pattern2 {
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
