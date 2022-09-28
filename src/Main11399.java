import java.util.*;
import java.io.*;

public class Main11399 {
    static int N;
    static Integer[] arr;
    static int result=0;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(solution());
    }

    public static int solution(){
        int[] sum = new int[N];
        sum[0] = arr[0];
        result += sum[0];
        for (int i = 1; i < N; i++){
            sum[i]= arr[i] + sum[i-1];
            result += sum[i];
        }
        return result;
    }
    public static void input() throws IOException{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        //System.out.println(N);

        arr=new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i< N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        // arr을 작은수부터 정렬시킨다
        Arrays.sort(arr);
        System.out.println(N);
        System.out.println("arr[]: "+Arrays.toString(arr));
    }
}
