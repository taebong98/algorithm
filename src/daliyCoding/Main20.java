package daliyCoding;

public class Main20 {
    public static void main(String[] args) {
        String str = "wwwwwppp";
        Main20 main20 = new Main20();

        System.out.println(main20.compressString(str));
    }

    public String compressString(String str) {
        // 결과를 담을 문자열
        String result ="";

        // 빈 문자열을 입력받을 경우 빈 문자열을 리턴해야 한다.
        if (str.length()==0) return result;

        // 연속 구간을 반복하는 수를 담을 변수
        int cnt = 1;

        // for 문을 순회한 index 번호를 담을 변수
        int num = 0;

        // 연속되는 문자열이 몇개인지 알아내기
        // result 에 연속되는 문자열의 개수 + 문자열 추가
        for(int i=0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                cnt++;
                if (cnt>=3) {
                    result = "" + cnt + str.charAt(cnt-1);
                }
            } else {
                num = cnt;
                cnt=1;
            }

            if (i >= num && cnt<3) result += str.charAt(i+1);
        }

        return result;
    }
}
