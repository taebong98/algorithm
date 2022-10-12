package BOJ;

import java.util.*;
import java.io.*;

public class Main24479 {
    static int N,M,R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] check;
    static int count;

    public static void main(String[] args) throws IOException{
        solution();

    }

    static void solution() throws IOException{
        // N,M,R을 입력받는다.
        System.setIn(new FileInputStream("src/BOJ/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 리스트 타입의 리스트를 만든다.
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 간선정보 u,v로 그래프를 채운다 -> 1 4면 .get(1).add(4) / get(4).add(1)
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 각 그래프를 내림차순 정렬한다.
        for(int i =1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        // 방문 순서를 담을 check 배열을 만든다.
        check = new int[N+1];
//        System.out.println(graph);

        // 방문 순서를 카운트할 count 변수를 만든다.
        count = 1;
        dfs(R);

        for(int i = 1; i < check.length; i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int R) {
        // check 배열 R 번째 인덱스에 count를 넣는다.
        check[R] = count;

        // 재귀함수 실행조건
        // 그래프리스트 요소들을 하나씩 순회한다.
        for (int i = 0; i<graph.get(R).size(); i++) {
            // 그래프에 있는 노드들의 정보를 담을 새로운 변수 생성
            int newR = graph.get(R).get(i);
            // check 배열 R 번째 인덱스가 0이면 newR을 넣는다.
            if(check[newR]==0) {
                count++;
                dfs(newR);
            }
        }
    }
}