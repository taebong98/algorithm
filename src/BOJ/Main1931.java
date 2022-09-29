package BOJ;

import java.io.*;
import java.util.*;
// 회의실 배정
public class Main1931 {
    static int N;
    static int[][] arr;
    static int count = 1;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(solution());
    }

    public static void input() throws IOException{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0] - o2[0];
                else return o1[1] - o2[1];
            }
        });
    }
    public static int solution(){

        // 배열 arr[0][1]을 초기값으로 설정
        int num=arr[0][1];

        // for 문을 돌린다. i = arr.length
        for(int i = 1; i < N; i++){
            // if 회의가 끝나는 시간보다 다음 회의가 시작하는 시간이 늦으면
            // -> if arr[i][1] < arr[i][0]
            if(num <= arr[i][0]){
                num = arr[i][1];
                count++;
            }
        }
        return count;
    }
}
