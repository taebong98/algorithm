package BOJ;

import java.io.*;

public class Main10870 {


    public static void main(String[] args) throws IOException{
//        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n){
        if (n==0) return 0;
        if (n==1) return 1;

        return solution(n-1) + solution(n-2);
    }
}
