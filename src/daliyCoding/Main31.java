package daliyCoding;

import java.util.ArrayList;

public class Main31 {
    public static void main(String[] args) {
        System.out.println(powerSet("abcd"));
    }
    public static ArrayList<String> powerSet(String str) {
        ArrayList<String> result = new ArrayList();
        result.add("");

        // a, ab, ac, ad, abc, abd, acd
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i)+"");
        }
        return result;
    }
}
