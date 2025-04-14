import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt(); //시간
        int M = scan.nextInt(); //분

        //45분 미만일 경우
        if (M < 45) {

            //현재 시간에서 -1시간
            H = H - 1;
            //M이 45분 미만이면 부족한 시간을 보충해야되서 15분 더해주기
            M = M + 15;

            //만약 시간이 0보다 작은 경우, M이 음수가 되는 경우
            if (H < 0) {
                //시간은 23시로 변경
                H = 23;
            }
            
            //M이 45분 이상일 경우
        } else {
            //분에서 45를 빼주기
            M = M - 45;
        }

        System.out.println(H + " " + M);

        scan.close();

    }
}