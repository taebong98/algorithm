package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4344 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr;

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());

            arr = new int[N];

            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
            }
            int sum = Arrays.stream(arr).sum();
            double avg = (sum / N);
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) count++;
            }

            double result = (double) count / N * 100;
            System.out.printf("%.3f%%\n",result);
        }
    }
}
