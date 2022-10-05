package daliyCoding;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {
        String[] arr = {"YCDt", "oao", "unI"};
        System.out.println(readVertically(arr));
    }

    public static String readVertically(String[] arr) {
        int max = 0;

        // arr 원소중 가장 긴 길이의 문자열 검색
        for (int i =0; i<arr.length; i++) {
            if(arr[i].length() > max) max=arr[i].length();
        }

        // 새로운 배열생성
        String[] tmp = new String[max];
        System.out.println(Arrays.toString(tmp));

        // 기존 문자열을 하나씩 순회한다 (str 변수에 arr[i]의 값을 넣어준다)
        for (int i =0; i<arr.length; i++) {
            String str = arr[i];
            // str을 순회하면서
            for (int j = 0; j < str.length(); j++) {
                // tmp가 비어있으면 str의 j번째 원소를 추가한다.
                if(tmp[j] == null) {
                    tmp[j] = Character.toString(str.charAt(j));
                }
                // tmp가 비어있지 않으면 기존 문자열에 j번째 chr를 추가한다.
                else{
                    tmp[j] = tmp[j] + str.charAt(j);
                }
            }
        }


        System.out.println(Arrays.toString(tmp));
        String result = "";
        // tmp 배열을 순회하면서 문자열로 바꿔준다.
        for (int i =0; i<tmp.length; i++) {
            result = result+tmp[i];
        }
        return result;
    }
}
