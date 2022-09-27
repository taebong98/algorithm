import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {
        String arr[]={"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++) {
            System.out.println();
            int num = (int) (Math.random() * 3);
            System.out.println("[혜봉 vs Java] 가위바위보 대결 ㅋㅋ");
            System.out.println("가위, 바위, 보 선택!!");
            System.out.println(">>>>");
            String input = sc.nextLine();
            System.out.println();

            String cm = "";
            if (input.equals("가위")) {
                if (num == 0) {
                    cm = "가위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer" + cm);
                    System.out.println("비겼읍니다,,,");
                } else if (num == 1) {
                    cm = "바위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("20분 ㅅㄱㅋㅋ");
                } else if (num == 2) {
                    cm = "보";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("유산소 40분 ㅜㅜ");
                }
            }
            else if (input.equals("바위")) {
                if (num == 0) {
                    cm = "가위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer" + cm);
                    System.out.println("유산소 40분 ㅜㅜ");
                } else if (num == 1) {
                    cm = "바위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("비겼습니다,,,");
                } else if (num == 2) {
                    cm = "보";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("20분 ㅅㄱㅋㅋ");
                }
            }

            else if (input.equals("보")) {
                if (num == 0) {
                    cm = "가위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer" + cm);
                    System.out.println("20분 ㅅㄱㅋㅋ");
                } else if (num == 1) {
                    cm = "바위";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("유산소 40분 ㅜㅜ");
                } else if (num == 2) {
                    cm = "보";
                    System.out.println("혜봉: " + input);
                    System.out.println("Computer: " + cm);
                    System.out.println("비겼습니다,,");
                }
            }
            else System.out.println("다시 입력해주세욤");
        }
    }
}
