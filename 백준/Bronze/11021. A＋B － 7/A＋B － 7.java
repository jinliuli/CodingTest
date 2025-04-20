import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        //유효성검사 먼저 하기
        //T는 1부터 시작한다
        for (int i = 1; i < T + 1; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if (0 < A && A < 10 && 0 < B && B < 10) {
                int result = A + B;
                bw.write("Case #" + i + ": " + result + "\n");

            } else {
                System.out.println("잘못 입력하였습니다. 0 < A,B < 10이내의 숫자를 입력해주세요.");
            }

        }
        //닫기
        bw.flush();
        bw.close();
        br.close();
    }
}