
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int N, M, res;
	static int[][] map, dist;
	static boolean[][] visited;
	// 상 하 좌 우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		dist = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(str.substring(j, j + 1));
			}
		} // 미로 정보 입력

		// 0 : 벽, 1 : 길
		dist[0][0] = 1;
		visited[0][0] = true; // 시작지점 방문체크
		bfs(0, 0);
		System.out.println(dist[N - 1][M - 1]);

	}// main

	static void bfs(int r, int c) {

		Queue<Node> queue = new LinkedList<>();

		queue.add(new Node(r, c)); // 큐에 현재 지점 넣어주기

		// 큐가 비지 않는 동안 반복
		while (!queue.isEmpty()) {

			Node now = queue.poll(); // 큐에서 하나 빼서

			// 델타탐색
			for (int i = 0; i < 4; i++) {

				int nr = now.x + dr[i];
				int nc = now.y + dc[i];

				// 범위 안에 들어오고 방문 안했고 다음 목적지가 길이라면
				if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && map[nr][nc] == 1) {
					queue.add(new Node(nr, nc)); // 큐에 넣어주기
					visited[nr][nc] = true; // 방문체크
					dist[nr][nc] = dist[now.x][now.y] + 1;

				}

			}

		} // while

	}// bfs

}
