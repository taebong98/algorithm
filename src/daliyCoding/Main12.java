package daliyCoding;

import java.util.Arrays;

public class Main12 {
    static int[] arr = {1,2,3};
    static int cnt = 0;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArr(arr)));
    }

    public static int[] reverseArr(int[] arr) { // [1,2,3]

        if(arr.length==0) return new int[]{};

        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length); // [3], [2] [1]
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1)); // [1,2] [1] []

        int[] dest = new int[arr.length];

        System.arraycopy(head,0, dest, 0,1); // dest -> [3]
        System.arraycopy(tail,0,dest, head.length, tail.length); //


        return dest;
    }
}
