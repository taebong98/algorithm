package BOJ;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main24479 {
    static int N,M,R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


    public static void main(String[] args) throws IOException{
        input();
    }

    public static void input() throws IOException{
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
//        System.out.println(graph);

        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            //
            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        System.out.println(graph);

    }

    public static int solution() {
        // N: 정점의 수 -> 5, M: 간선의 수 -> 5, R: 시작정점 -> 1
        // i번째 줄에는 정점 i의 방문순서를 출력

        return 1;
    }
}
