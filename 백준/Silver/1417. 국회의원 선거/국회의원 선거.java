import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) - 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int dasom = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            pq.add(Integer.parseInt(br.readLine()));

        }

        int cnt = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom) {
            dasom++;
            pq.add(pq.poll() - 1);
            cnt++;
        }

        System.out.println(cnt);


    }
}
