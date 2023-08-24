public class Pattern19 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int i = 1; i <= n - row - 1; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                int num = binCoeff(row, col);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static int fact(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    static int binCoeff(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
}
