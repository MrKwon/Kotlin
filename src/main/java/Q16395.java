import java.util.Scanner;

public class Q16395 {
    private static int[][] arr = new int[30][30];

    private static int solve(int n, int k) {
        if (k == 0 || n == k || n == 0) return 1;
        if (arr[n][k] != 0) return arr[n][k];

        return arr[n][k] = solve(n - 1, k) + solve(n - 1, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt() - 1, sc.nextInt() - 1));
    }
}
