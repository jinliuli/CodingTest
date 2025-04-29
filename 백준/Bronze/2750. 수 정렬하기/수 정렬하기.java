import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //N개의 수가 주어 졌을때 오름차순으로 정렬
        int N = scan.nextInt(); //수의 개수 입력
        int [] numbers = new int[N]; //배열바구니 만들기

        //N 개의 숫자 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();   //바구니에 정수 입력하여 N개 담기
        }
        
        //버블 정렬
        for (int i = 0; i < N - 1; i++) { //배열의 크기만큼 반복 (한번 돌 때 마다 큰 수가 뒤로 가도록)
            for (int j = 0; j < N - 1 - i; j++) { //앞에서부터 하나씩 옆 숫자와 비교 
                if (numbers[j] > numbers[j + 1]) { //앞 숫자가 더 크다면
                    //두 숫자의 위피를 바꿈(큰 수 가 뒤로 가도록하기)
                    int temp = numbers[j]; //임시 공간을 만들어서 앞의 숫자를 저장
                    numbers[j] = numbers[j + 1]; //앞 숫자 자리에 뒷 숫자 넣기
                    numbers[j + 1] = temp; //뒷 숫자 자리에 임시 저장한 숫자 넣기
                }
            }
        }

        //배열 결과 출력
        for (int num : numbers) {
            System.out .println(num); //정렬된 수 출력
        }

        scan.close();
    }
}