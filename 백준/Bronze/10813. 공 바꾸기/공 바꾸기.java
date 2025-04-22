import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //바구니 개수
        int M = scan.nextInt(); //공을 바꾸는 횟수

        int[] baskets = new int[N]; //바구니 개수만큼 담을 배열

        // 처음에 바구니 번호화 같은 번호의 공을 넣기
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        //공 바꾸기 M번 반복
        //m은 반복되는 작업 번호
        for (int m = 0; m < M; m++) {

            //어떤 바구니끼리 공을 바꿀건지 입력하기
            int i = scan.nextInt(); //첫번째 바구니 번호
            int j = scan.nextInt(); //두번째 바구니 번호

            //두 바구니에 들어 있는 공을 바꿈 (배열은 0번부터 시작하기 떄문에 i-1부터 시작)
            //두번째 바구니는 baskets[1]
            int temp = baskets[i - 1]; //temp = 공을 잠깐 저장하는 임시 공간
            baskets[i - 1] = baskets[j - 1]; //두번째 바구니에 있던 공을 첫번째 바구니로 옮기기
            baskets[j - 1] = temp; //임시 공간에 있던 공을 두번째 바구니에 넣기
        }

        //결과 출력
        for (int ball : baskets) {
            System.out.print(ball + " ");
        }

        scan.close();
    }
}