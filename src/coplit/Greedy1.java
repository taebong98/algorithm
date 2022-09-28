package coplit;

import java.util.Arrays;

public class Greedy1 {
    static int[] stuff = {60, 73, 80, 87, 103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182}; //4
    static int limit = 200;
    static int count = 1;
    static int boxCount = 0;

    public static void main(String[] args) {
        System.out.println(solution(stuff, limit));

    }

    public static int solution(int[] stuff, int limit) {
        int leftIdx = 0;
        int rightIdx = stuff.length - 1;
        int twoStuff = 0;
        Arrays.sort(stuff);

        while(leftIdx < rightIdx) {
            if(stuff[leftIdx] + stuff[rightIdx] <= limit) {
                leftIdx++;
                rightIdx--;
                twoStuff++;
            } else {
                rightIdx--;
            }
        }
        return stuff.length - twoStuff;
    }
}

