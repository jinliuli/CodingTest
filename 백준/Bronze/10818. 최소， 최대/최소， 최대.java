import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //숫자의 개수 받기
        int[] arr = new int[N]; //숫자를 저장하는 배열만들기

        //숫자들을 배열에 담기
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        //최댓값과 최솟값 구하기
        int max = arr[0];
        int min = arr[0];

        //배열에 있는 숫자들을 하나씩 확인하면서 비교
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i]; //더 큰 값이 나오면 max를 바꿈
            }
        }
        for (int i = 1; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i]; //더 작은 값이 나오면 min을 바꿈
            }
        }

        //결과값 출력
        System.out.println(min + " " + max);

        scan.close();

    }
}