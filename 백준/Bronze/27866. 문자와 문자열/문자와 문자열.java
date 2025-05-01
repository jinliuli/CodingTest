import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //사용자 입력을 받을 준비

        String S = scan.next(); //첫째줄에서 단어(문자열)를 입력받음
        int i = scan.nextInt(); //둘째줄에서 위치(숫자)를 입력받음

        //문자열은 0부터 시작하니까 i-1 위치의 문자를 출력
        System.out.println(S.charAt(i - 1)); //i번째 글자를 출력

        scan.close(); //스캐너 종료


    }
}