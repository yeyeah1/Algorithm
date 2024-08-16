import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int K;
    static int[][] stuff;
    static long[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        stuff = new int[N + 1][2];
        dp = new long[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            stuff[i][0] = Integer.parseInt(st.nextToken()); // 무게
            stuff[i][1] = Integer.parseInt(st.nextToken()); // 가치
        }

        // dp의 0번째 줄 -> 0 (물건을 아무것도 넣지 않음)
        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= K; w++) {

                // 현재 무게에서의 최적해는 dp[i-1][w]
                // 이번 물건을 고려했을 때 dp[i-1][w-stuff[i][0]]+stuff[i][1]
                if (stuff[i][0] <= w) {

                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - stuff[i][0]] + stuff[i][1]);

                } else { // 물건의 무게가 배낭의 무게보다 무거울 때

                    dp[i][w] = dp[i - 1][w];

                }

            }
        }

        System.out.println(dp[N][K]);

    } // main
}
