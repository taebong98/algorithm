package BOJ;

import java.io.*;
import java.util.*;

public class Main24480 {
    static int N,M,R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 정점들의 정보를 담을 배열
    static int[] check; // 방문한 정점을 기록할 배열
    static int count; // 방문 순서

    public static void main(String[] args) throws IOException{
        input();
//        System.out.println(Arrays.toString(check));


    }


    static void input() throws IOException{
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N+1; i ++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(v).add(u);
            graph.get(u).add(v);
        }

        for(int i =1; i< graph.size(); i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
//        System.out.println(graph);
        check = new int[N+1];

        count=1;
        dfs(R);
        for(int i =1; i<check.length; i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.println(graph);
        System.out.println(sb);

    }
    static void dfs(int R){
        check[R] = count;

        for(int i = 0; i<graph.get(R).size(); i++) {
            int newVertex = graph.get(R).get(i);

            if(check[newVertex]==0) {
                count++;
                dfs(newVertex);
            }
        }
    }
}