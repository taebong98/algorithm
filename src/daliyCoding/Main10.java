package daliyCoding;

import java.util.*;

public class Main10 {
    static String  str = "4547934699999";
    public static void main(String[] args) {
        System.out.println(solution(str));
    }

    static String solution(String str){
        String result = ""+str.charAt(0);

        // for str을 하나씩 순회하면서
        for(int i =1; i<str.length(); i++){
            // if str.charAt(i) 과 str.charAt(i+1)가 모두 홀수이면
            if((str.charAt(i-1)-'0')%2 ==1 && (str.charAt(i)-'0')%2==1) {
                // i+1 번쩨 인덱스에 "-"를 추가한다. sb.insert(i, "-")
                result = result+"-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}
