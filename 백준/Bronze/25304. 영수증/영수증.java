import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt(); //영수증에 적힌 총 금액 X
        int N = scan.nextInt(); //영수증에 적힌 구매 물건의 종류의 수 N
        int result = 0; //a*b들의 결과값을 저장하는 변수

        //유효성검사 먼저 하기
        if (1 > X || X > 1000000000) {
            System.out.println("올바르지 않은 총 금액입니다.(1 ~ 1,000,000,000의 금액을 입력해주세요.)");
            return;
        }
        if (1 > N || N > 100) {
            System.out.println("올바르지 않은 구매 수량입니다.(1 ~ 100의 수량을 입력해주세요.)");
            return;
        }

        //N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어짐
        for (int i = 0; i <= N-1; i++) {
            int a = scan.nextInt(); //각 물건의 가격
            int b = scan.nextInt(); //각 물건의 개수
            result += a * b;    //반복문을 돌면서 a*b를 해서 금액을 result에 추가함
            //System.out.println("현재 합계: "+result); //합계 확인용 출력
        }

        //결과값 출력
        if (result == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}