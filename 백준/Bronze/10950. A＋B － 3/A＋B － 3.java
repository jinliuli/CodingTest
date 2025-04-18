import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();//테스트 케이스의 개수

        int[] results = new int[T]; //결과를 담을 배열

        for (int i = 0; i < T; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            //0 < A,B < 10
            if (0 < A && A < 10 && 0 < B && B < 10){
                results[i] = A + B; //결과를 배열에 저장
            } else {
                System.out.println("A,B는 0 ~ 10 이내의 값을 입력해주세요.");
                i--; //값을 다시 입력받기 위해 인덱스 감소
            }
        }


        //결과값 출력
        for (int result : results) {
            System.out.println(result);
        }

        scan.close();
    }
}