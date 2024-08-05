import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, K;
	static int[] map;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 수빈
		K = Integer.parseInt(st.nextToken()); // 동생

		map = new int[100001];

		bfs(N);

	}

	static void bfs(int start) {

		map[start] = 1; // 방문처리

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(start);

		while (!queue.isEmpty()) {

			int now = queue.poll();

			// 동생 있는 지점으로 가면 출력
			if (now == K)
				System.out.println(map[now] - 1);


			if (now - 1 >= 0 && map[now - 1] == 0) {
				map[now - 1] = map[now] + 1;
				queue.offer(now - 1);
			}
			
			if (now + 1 < 100001 && map[now + 1] == 0) {
				map[now + 1] = map[now] + 1;
				queue.offer(now + 1);
			}

			if (now * 2 < 100001 && map[now * 2] == 0) {
				map[now * 2] = map[now] + 1;
				queue.offer(now * 2);
			}
		}

	}

}