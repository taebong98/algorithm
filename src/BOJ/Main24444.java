package BOJ;
import java.io.*;
import java.util.*;

public class Main24444 {
    static int N,M,R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int count;
    static int[] check;



    public static void main(String[] args) throws IOException{
        solution();
    }


    public static void solution () throws IOException {
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        check = new int[N+1];

        for(int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        bfs(R);

        for(int i = 1; i<check.length; i++) {
            System.out.println(check[i]);
        }
    }


    static void bfs(int R) {
        Queue<Integer> q = new LinkedList<>();
        count =1;

        q.offer(R);
        check[R]=count;
        count++;

        while (!q.isEmpty()) {
            int a = q.poll();

            for(int i = 0; i<graph.get(a).size(); i++) {
                int nextR = graph.get(a).get(i);
                if(check[nextR] == 0) {
                    q.offer(nextR);
                    check[nextR]= count++;
                }

            }

        }

    }
}