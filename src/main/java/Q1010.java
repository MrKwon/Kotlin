import java.io.*;
import java.util.Arrays;

public class Q1010 {
    private static int[][] arr = new int[30][30];

    private static int solve(int n, int k) {
        if (n == 0 || n == k || k == 0) return 1;
        if (arr[n][k] != -1) return arr[n][k];

        return arr[n][k] = solve(n - 1, k) + solve(n - 1, k - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++)
            Arrays.fill(arr[i], -1);

        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] input = reader.readLine().split(" ");
            writer.write(solve(Integer.parseInt(input[1]), Integer.parseInt(input[0])) + "\n");
        }
        writer.flush();
        writer.close();
    }
}
