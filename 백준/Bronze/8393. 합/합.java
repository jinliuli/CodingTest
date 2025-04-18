import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //n 입력 받기

        //유효성검사 먼저 하기 1 < n < 10000
        if (1 <= n && n <= 10000) {
            int sum = 0; //다 더한 숫자 변수 선언

            //반복문 돌면서 1부터 n까지 더하기
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            //결과값 출력
            System.out.println(sum);

        } else {
            System.out.println("n는 1 ~ 10,000 이내의 값을 입력해주세요.");
        }

        scan.close();
    }
}