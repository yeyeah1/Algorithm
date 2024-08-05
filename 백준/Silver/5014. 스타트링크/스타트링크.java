import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int F,S,G,U,D;
	static int[] visited; //방문체크, 버튼 수 담아줄 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		F = Integer.parseInt(st.nextToken()); //총 건물의 높이
		S = Integer.parseInt(st.nextToken()); //시작 층
		G = Integer.parseInt(st.nextToken()); //목표 층
		U = Integer.parseInt(st.nextToken()); //위로 올라가는 층수
		D = Integer.parseInt(st.nextToken()); //아래로 내려가는 층수

		visited = new int[F + 1];

		bfs(S);

	}// main

	static void bfs(int s) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(s); // 시작정점 넣기
		visited[s] = 1; //굳이?

		while (!queue.isEmpty()) {

			int now = queue.poll();

			if (now == G) // 목표층수 도달시 리턴
				System.out.println(visited[now]-1);

			// 현재 위치 + U < 최고 층수, 방문한 적 없다면 큐에 넣기
			if (now + U <= F && visited[now + U] == 0) {
				visited[now + U] = visited[now] + 1; // 버튼 누른 횟수 + 1
				queue.offer(now + U);
			}

			// 현재 위치 - D > 0 , 방문한 적 없다면 큐에 넣기
			if (now - D > 0 && visited[now - D] == 0) {
				visited[now - D] = visited[now] + 1; // 버튼 누른 횟수 + 1
				queue.offer(now - D);
			}

		} // while

		if (visited[G] == 0) {
			System.out.println("use the stairs");
		}

	}// bfs

}
