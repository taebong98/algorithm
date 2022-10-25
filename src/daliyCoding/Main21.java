package daliyCoding;

public class Main21 {
    static int[] arr = {-50, -20, -30, -5, 40};

    public static void main(String[] args) {

        System.out.println(largestProductOfThree(arr));
    }

    static public int largestProductOfThree(int[] arr) {

        int sum = -2147483000;

        for (int i =0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length - 1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (sum < arr[i]*arr[j]*arr[k]) sum = arr[i]*arr[j]*arr[k];
                }
            }
        }
        return sum;
    }
}
