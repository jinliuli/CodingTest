import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //바구니 개수
        int M = scan.nextInt(); //공을 몇번 넣을건지 횟수

        int[] baskets = new int[N]; //바구니개수만큼 담을 배열

        //공을 M번 반복으로 넣기
        //m은 반복되는 작업 번호
        for (int m = 0; m < M; m++) {
            int i = scan.nextInt(); //시작 바구니
            int j = scan.nextInt(); //끝 바구니
            int k = scan.nextInt(); //넣을 공의 번호

            //바구니번호가 1부터 시작하기위해 i-1로 시작해서 j-1번까지 k번 공을 넣음
            //b는 배열 안에 바구니 위치
            for (int b = i-1; b <= j-1; b++) {
                baskets[b] = k;
            }
        }

        //결과 출력
        for (int num : baskets) {
            System.out.print(num + " ");
        }

        scan.close();
    }
}