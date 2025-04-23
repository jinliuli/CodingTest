import java.io.*;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //HashSet에 숫자를 넣으면 같은 숫자는 한번만 들어감(중복을 없애줌)
        HashSet<Integer> modSet = new HashSet<>(); //나머지를 담는 배열

        //10개의 숫자를 입력받고 각각 42로 나눈 나머지를 저장
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();   //자연수 입력 10개
            int mod = num % 42;         //각 숫자를 42로 나눈 나머지를 계산
            modSet.add(mod);            //각 나머지를 HashSet에 넣기
        }

        System.out.println(modSet.size()); //서로 다른 나머지 개수 출력

        scan.close();
    }
}