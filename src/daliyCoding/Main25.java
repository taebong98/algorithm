package daliyCoding;

public class Main25 {
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }

    public static long power(int base, int exponent) {
        int result = 1;

        if(exponent == 0) return 1;

        for (int i = 0; i < exponent; i++) {
            result = (result * base) % 94906249;
        }
        System.out.println((3*3) % 94906249);
        return result;
    }
}
