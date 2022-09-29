package coplit;

public class Algorithm8 {
    public static void main(String[] args) {

    }
    public int gcd(int m, int n) { //
        if (m % n == 0) return n;
        return gcd(n, m % n);
    }
}
