import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //숫자 개수 입력
        int[] arr = new int[N]; //입력받은 N을 담는 배열

        //숫자들 입력받디
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int V = scan.nextInt(); //찾으려는 정수를 입력

        int count = 0; //V가 몇개인지 세는 변수

        //배열안에 숫자를 맞는지 찾기
        for (int i = 0; i < N; i++) {
            //배열안에 숫자가 V와 맞다면 count숫자를 높인다.
            if (arr[i] == V) {
                count++;
            }
        }

        System.out.println(count); //결과 출력
        scan.close();

    }
}