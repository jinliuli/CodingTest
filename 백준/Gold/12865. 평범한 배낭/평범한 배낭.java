import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //물품의 수
        int K = scan.nextInt(); //최대 무게

        int[] W = new int[N+1]; //물건 무게
        int[] V = new int[N+1]; //물건 가치

        for (int i = 1; i <= N; i++) {
            W[i] = scan.nextInt();
            V[i] = scan.nextInt();
        }

        //2차원 배열로 만들기
        int[][] bag = new int[N+1][K+1];

        for (int i = 1; i <= N; i++) { //1번부터 N번물건까지 배낭에 담을지 고려하기
            for (int j = 1; j <= K; j++) { //배낭의 허용 무게를 0부터 K까지 하나씩 증가 시키면서 확인하기
                if (j < W[i]) {
                    bag[i][j] = bag[i-1][j]; //물건 넣기 직전의 값 유지
                } else { //현재 물건을 넣을 수 있는 무게가 남아있으면 → 두 가지 선택지 중 큰 값을 고름
                    bag[i][j] = Math.max(
                            bag[i-1][j],
                            bag[i-1][j-W[i]]+V[i]
                    );
                }
            }
        }
        System.out.println(bag[N][K]);

        scan.close();
    }

}