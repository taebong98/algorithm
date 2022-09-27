import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main10818 {
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        test();
    }

    private static void input() throws IOException{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st =new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    private static void test(){
        System.out.println(Arrays.toString(arr));
        System.out.println(n);
    }

}
