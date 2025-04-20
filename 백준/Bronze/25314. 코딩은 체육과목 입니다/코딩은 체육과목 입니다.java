import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //N바이트 정수
        int count = N/4;  //long을 사용하는 횟수
        
        //유효성검사 먼저 하기
        if (4 <= N && N <= 1000 && N%4 == 0) {
            
            //count만큼 long을 출력
            for (int i = 0; i < count; i++) {
                System.out.print("long ");
            }
            System.out.println("int");
        } else {
            System.out.println("잘못 입력하였습니다. 4 <= N <= 1000 이면서 4의 정수를 입력해주세요.");
        }

        scan.close();
    }
}