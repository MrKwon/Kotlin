import java.io.*;

public class Q1992 {
    public static String solve(int y, int x, int size, final String[][] arr) {
        if (size == 1)
            return arr[y][x];

        int half = size / 2;

        String lu = solve(y, x, half, arr);
        String ru = solve(y, x + half, half, arr);
        String ld = solve(y + half, x, half, arr);
        String rd = solve(y + half, x + half, half, arr);

        if (lu.equals(ru)
                && ru.equals(ld)
                && ld.equals(rd))
            return lu;
        else
            return "(" + lu + ru + ld + rd + ")";
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] tmp = reader.readLine().split("");
            for (int j = 0; j < n; j++)
                arr[i][j] = tmp[j];
        }

        writer.write(solve(0, 0, n, arr));
        writer.flush();
        writer.close();
    }
}
