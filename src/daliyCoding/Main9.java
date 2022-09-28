package daliyCoding;

public class Main9 {
    public static void main(String[] args) {
        String str = "lane Borrowed";
        System.out.println(solution(str));
    }

    public static boolean solution(String str) {
        // TODO:
        // if(str.length() == 0) return false;
        str= str.toLowerCase();
        for(int i = 4; i<str.length(); i++){
            if((str.charAt(i-4)=='a' && str.charAt(i)=='b') || (str.charAt(i-4)=='b' && str.charAt(i)=='a')) {
                return true;
            }
        }
        return false;
    }
}

