import java.io.*;

public class LIS {
    // binary searching index of 지금까지 만든 부분 배열이 갖는 길이 i인 증가 부분 수열 중 최소의 마지막 값
    private static int CeilIndex(int A[], int l, int r, int key) {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] >= key)
                r = m;
            else
                l = m;
        }

        return r;
    }

    private static int LIS(int A[], int size) {
        int[] tail = new int[size];
        int len;

        tail[0] = A[0];
        len = 1;
        for (int i = 1; i < size; i++) {
            if (A[i] < tail[0])
                tail[0] = A[i];

            else if (A[i] > tail[len - 1])
                tail[len++] = A[i];

            else
                tail[CeilIndex(tail, -1, len - 1, A[i])] = A[i];
        }

        return len;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] tmp = reader.readLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(tmp[i]);

        writer.write(String.valueOf(LIS(arr, n)));
        writer.flush();
        writer.close();
    }
}
