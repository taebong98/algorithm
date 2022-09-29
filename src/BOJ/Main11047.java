package BOJ;

import java.io.*;
import java.util.*;

public class Main11047 {
    static int n,k;
    static int[] coin;
    static int answer=0;
    public static void main(String[] args) throws IOException{
        input();
        System.out.println(solution());
    }

    public static int solution(){
        for(int i = n-1; i >=0; i--){
            answer = answer + k/coin[i];
            k = k%coin[i];
        }
        return answer;
    }

    public static void input() throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        coin = new int[n];

        for(int i = 0; i < n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
    }
}