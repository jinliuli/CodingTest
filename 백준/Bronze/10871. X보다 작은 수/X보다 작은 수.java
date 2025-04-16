import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //숫자 개수 입력
        int X = scan.nextInt(); //X보다 작은 수 의 기준 숫자
        int[] A = new int[N]; //입력받은 N을 담는 배열

        //숫자들 입력받다
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        //배열안에 숫자를 맞는지 찾기
        for (int i = 0; i < N; i++) {
            //배열안에 숫자가 V와 맞다면 count숫자를 높인다.
            if (A[i] < X) {
                System.out.print(A[i] + " "); //숫자와 쉽표를 같이 출력
            }
        }

        scan.close();

    }
}