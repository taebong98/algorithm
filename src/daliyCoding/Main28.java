package daliyCoding;

public class Main28 {
    public static void main(String[] args) {
        String str = "(())";
        System.out.println(balancedBrackets(str));
//        System.out.println(balancedBrackets());
    }

    // str 의 맨 뒤의 괄호를 lastBracket 변수에 담는다
    // str 을 앞에서부터 탐색하면서 lastBracket 과 같은 문자를 지우고 남은 문자열을 str 에 대입한다.
    // 같은 문자가 없으면 false를 리턴한다.
    // str의 문자열이 비어있으면("") true를 리턴한다.

    public static String removeBracket(String str) {
        char lastBracket = str.charAt(str.length()-1);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != lastBracket) {
                str = str.substring(0, i) + str.substring(i + 1, str.length() - 1);
                break;
            }
        }

        return str;
    }

    public static boolean balancedBrackets(String str) {
        if (str.contains("{") || str.contains("}") || str.contains("[") || str.contains("]")) return false;

        if (str.length() == 0) return true;
        str = removeBracket(str);

        return false;
    }
}
