package daliyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Main19 {
    public static void main(String[] args) {
        System.out.println(decryptCaesarCipher("akhoor zruog", 3));

    }

    static String decryptCaesarCipher(String str, int secret) {
        String result = "";

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                result += " ";
            } else {
                int num = alpha.indexOf(str.charAt(i));
                int tobe = (num - secret + alpha.length()) % alpha.length();
//                int tobe2 = (num - secret);
                result = result + alpha.charAt(tobe);
            }
        }

        return result;
    }
}
