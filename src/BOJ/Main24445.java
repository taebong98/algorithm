package BOJ;

import java.io.*;
import java.util.*;
public class Main24445 {
    static int M,N,R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    static int[] check;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i< M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        visit = new boolean[N+1];
        check = new int[N+1];
        bfs(R);
    }
    public static void bfs(int R) {
        Queue<Integer> q =new LinkedList<>();
        q.add(R);

        visit = new boolean[N+1];
        visit[R] = true;

        int cnt = 0;
        check = new int[N+1];

        // queue 값이 빈값이 될때까지 순회하면서
        // queue 를 하나 빼준값을 a 변수에 저장하고 cnt를 하나 올린다.
        // check 배열 a번째 인덱스에 cnt를 저장한다.
        while (!q.isEmpty()) {
            int a = q.poll();
            cnt++;
            check[a] = cnt;

            // graph의 i번째 index를 순회하면서
            // 만약 방문하지 않았으면 방문했다고 체크를하고
            // queue에 요소를 추가한다.
            for(int i : graph.get(a)) {
                if (!visit[i]) {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }

        for(int i = 1; i < check.length; i++) {
            System.out.println(check[i]);
        }
    }
}