package coplit;

public class Algorithm2 {
    public static void main(String[] args) {
        int result=0;
        int k = 4972;
        // 가지고 있는 동전의 배열을 만든다
        int[] coin = {1,5,10,50,100,500};

        // for i가 5부터 0까지
        for (int i = 5; i>=0; i--){
            // if k > coin[i] 일때
                // k를 coin[i]로 나눈 몫을 result에 더한다 ( 필요한 동전의 개수 )
                result += k/coin[i];
                // k를 coin[i]로 나눈 나머지를 k에 저장한다 ( 거스름돈 k 의 남은 값)
                k = k%coin[i];

        }
        System.out.println(result);
    }
}
