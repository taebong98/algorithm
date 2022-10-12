package daliyCoding;

public class Main14 {
    static int[] arr = {979, 1737, -2146, -337, 1316};

    public static void main(String[] args) {
        System.out.println(superIncreasing(arr));
    }

    public static boolean superIncreasing(int[] arr) {
        int sum =0;
        int lastNum = 0;
        // 배열의 마지막 요소를 새 변수에 저장한다.
        lastNum = arr[arr.length-1];

        // 배열의 마지막-1 요소까지 값을 더한다.

        for(int i = 0; i < arr.length-1; i++) {
            sum+=arr[i];
            System.out.println("sum = " + sum);
        }
        System.out.println(lastNum);
        System.out.println(979+1737-2146-337);
        if(lastNum > sum) return true;
        else return false;

        }
    }
