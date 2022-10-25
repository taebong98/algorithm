package daliyCoding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main22 {
    static int[] arr = {30, 5, 21, 10, 4, 13, 8, 25, 19, 1};
/*
* 5 30 21 10 4
* 5 21 30 10 4
* 5 21 10 30 4
* 5 21 10 4 30
* */
    public static void main(String[] args) {
//        bubbleSort(arr);
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j ++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
