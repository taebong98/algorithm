package daliyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Main23 {
    static int[] memo = new int[1000];
    public static void main(String[] args) {
        int num = 9;
        System.out.println(fibonacci(num));
    }

    public static int fibonacci (int num) {
        if (num < 2) return num;
        else if(memo[num] != 0) return memo[num];
        else return memo[num] = fibonacci(num-1) + fibonacci(num-2);
    }
//
//    public static int fibonacci(int num) {
//        if(num < 2) return num;
//        else return fibonacci(num -1) + fibonacci(num -2);
//    }
}
