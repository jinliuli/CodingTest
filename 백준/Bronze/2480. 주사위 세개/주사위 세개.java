import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();
        int dice3 = scan.nextInt();

        // 입력값 확인 (1~6 아니면 종료)
        if (dice1 < 1 || dice1 > 6 || dice2 < 1 || dice2 > 6 || dice3 < 1 || dice3 > 6) {
            System.out.println("⚠️ 주사위는 1부터 6까지만 가능합니다.");
            return; // 프로그램 종료
        }

        int prize = 0; //상금을 저장하는 변수

        //같은 눈이 3개가 나오는 경우
        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1 * 1000;

        //같은 눈이 2개가 나오는 경우
        } else if (dice1 == dice2) {
            prize = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            prize = 1000 + dice2 * 100;
        } else if (dice3 == dice1) {
            prize = 1000 + dice3 * 100;

        //모두 다른 눈이 나오는 경우
        } else {
            int max = dice1; //처음엔 dice1이 가장 크다고 가정
            if (dice2 > max) {
                max = dice2; //dice2가 더 크면 max를 dice2로 바꿈
            }
            if (dice3 > max) {
                max = dice3; //dice3이 더 크면 max를 dice3로 바꿈
            }
            prize = max * 100;
        }

        //결과값 출력
        System.out.println(prize);

        scan.close();
    }
}