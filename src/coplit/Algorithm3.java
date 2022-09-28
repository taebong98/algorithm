package coplit;

public class Algorithm3 {
    public static void main(String[] args) {
        int[][] board1 = {
                {50, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0}
        };
        String operation = "RRRRDLL";


        System.out.println(solution(board1, operation));

    }
    public static Integer solution(int[][] board, String operation){
        int width = 0;
        int height = 0;
        int sum = board[height][width];


        // for i=0 부터 operation 길이까지 순회하면서
        for (int i = 0; i < operation.length(); i++){

            // operation 의 char 를 하나씩 받아온다.
            char chr = operation.charAt(i);
            // if chr=='U' 일때
            if (chr =='U'){
                // board[-1][0]
                height--;
            }

            // else if chr=='D' 일때
            else if (chr=='D') {
                // board[+1][0]
                height++;
            }

            // else if chr=='R' 일때
            else if (chr=='R') {
                // board[0][+1]
                width++;
            }

            // else if chr=='L' 일때
            else if (chr=='L') {
                // board[0][-1]
                width--;
            }

             if (height < 0 || height > 4) return null;
             if (width < 0 || width >4) return null;
             sum += board[height][width];

        }
        return sum;
    }
}
