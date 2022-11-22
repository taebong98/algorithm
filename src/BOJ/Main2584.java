package BOJ;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2584 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        list.sort(Integer::compareTo);
        System.out.println(list);
        int avg = list.stream().mapToInt(i -> i).sum() / list.size();
        int median = list.get(2);
        System.out.println(avg);
        System.out.println(median);

    }
}
