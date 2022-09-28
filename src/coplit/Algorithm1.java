package coplit;

import java.util.Arrays;

public class Algorithm1 {
    static int[] stuff = { 50, 50, 70, 80};
    static int limit = 100;

    public static void main(String[] args) {
        System.out.println(solution(stuff, limit));

    }

    public static int solution(int[] stuff, int limit) {
        int startIndex = 0;
        int lastIndex = stuff.length - 1;
        int twoStuff = 0;
        Arrays.sort(stuff);


        while (startIndex < lastIndex) {
            if (stuff[startIndex] + stuff[lastIndex] <= limit) {
                lastIndex--;
                startIndex++;
                twoStuff++;
            } else {
                lastIndex--;
            }
        }
//        while(leftIdx < rightIdx) {
//        if(stuff[leftIdx] + stuff[rightIdx] <= limit) {
//            // 다음 짐을 확인하기 위해 가장 가벼운 짐과 무거운 짐을 가리키는 인덱스를 옮겨주고
//            // 한번에 2개 옮길 수 있는 개수를 +1 해준다
//            leftIdx++;
//            rightIdx--;
//            twoStuff++;
//        } else {
//            // 위 조건에 맞지 않는 경우는 한번에 한 개만 나를 수 있는 경우이기 때문에
//            // 가장 무거운 짐의 인덱스만 옮겨준다
//            rightIdx--;
//        }
//    }

        return stuff.length - twoStuff;
    }
}
