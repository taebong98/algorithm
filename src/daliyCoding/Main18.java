package daliyCoding;

public class Main18 {
    public static void main(String[] args) {
        String str = "Hello6 9World 2,";
        String strInt = str.replaceAll("[^\\d]","");

        int sum = 0;
        for (int i =0; i < strInt.length(); i++) {
            sum += strInt.charAt(i)-'0';
        }

        String str1 = str.replaceAll(" ","");
        int length = str1.length() - strInt.length();

        double result = (double) sum/length;

        System.out.println(Math.round(result));

    }
}
