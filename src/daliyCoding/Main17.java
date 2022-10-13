package daliyCoding;

public class Main17 {
    public static void main(String[] args) {
//        SquareRoot(50);
//        sqrt(50);
        System.out.println(sqrt(50));
    }

    public static int SquareRoot(int num) {
        int highNum=0;
        for(int i =0; i < num/2; i++) {
            if(i*i <= num) {
                highNum = i;
            }
        }
        return highNum;
    }
    static double sqrt(long n) {
        double x = SquareRoot(50);
        for (int i = 0; i < 10; i ++) {
            x = 0.5 * (n / x+x);
        }
        return x;
    }
}
