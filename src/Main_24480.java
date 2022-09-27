import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_24480{
    static ArrayList<Integer> list[];

    public static void main(String[] args) throws IOException {
        input();
        test();
//        ArrayList<Integer> list[] = new ArrayList[N+1];
//
//        for(int i = 0; i<M; i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            list[a].add(a);
//            list[b].add(b);

    }

    static void input() throws IOException{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        list= new ArrayList[N+1];
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(a);
            list[b].add(b);
        }
    }

    static void test(){
        System.out.println(list);
    }
}
