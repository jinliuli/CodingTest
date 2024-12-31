import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> totalStudents = new HashSet<>();
        for (int i = 1; i <= 30; i++) {
            totalStudents.add(i);
        }
        // 제출한 학생의 출석번호를 저장할 집합
        Set<Integer> submittedStudents = new HashSet<>();
        for (int i = 0; i < 28; i++) {
            int n = scan.nextInt();
            submittedStudents.add(n);
        }

        // 제출하지 않은 학생의 출석번호를 찾기
        totalStudents.removeAll(submittedStudents);

        // 제출하지 않은 학생의 출석번호를 정렬
        TreeSet<Integer> notSubmittedStudents = new TreeSet<>(totalStudents);

        // 결과 출력
        for (int student : notSubmittedStudents) {
            System.out.println(student);
        }

        scan.close();
    }

}