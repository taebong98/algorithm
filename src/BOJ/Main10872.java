package BOJ;

import java.io.*;

public class Main10872 {
    static int n;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(solution(-1));
    }

    public static int solution(int n){
        if (n<=1) return 1;

        return solution(n-1)*n;
    }

    public static void input() throws IOException{
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

    }
}
