import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 우선순위 높은 순
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int now = Integer.parseInt(st.nextToken());

            if (now == 0) {
                if (pq.size() > 0) {
                    sb.append(pq.peek()).append("\n");
                    pq.poll();
                } else {
                    sb.append(-1).append("\n");
                }
            } else {
                for (int j = 0; j < now; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }

        } // N

        System.out.println(sb.toString());

    } // main
}
