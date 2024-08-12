import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M, V;
    static int[][] map;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 정점
        M = Integer.parseInt(st.nextToken()); // 간선
        V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점

        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            map[r][c] = map[c][r] = 1;
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);

    } // main

    static void dfs(int v) {
        visited[v] = true; // 시작정점 방문체크
        sb.append(v + " ");

        for (int i = 0; i <= N; i++) {
            // 현재 내 위치의 노드와 인접해있고 (간선이 있고) 방문하지 않았다면 재귀
            if (map[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    } // dfs

    static void bfs(int v) {
        queue.add(v); // 시작정점 큐에 add
        visited[v] = true; // 방문체크

        // 모든 노드 방문할 때까지
        while (!queue.isEmpty()) {

            int now = queue.poll();
            sb.append(now + " ");

            for (int i = 1; i <= N; i++) {

                // now와 인접해있고 방문하지 않았다면
                if (map[now][i] == 1 && !visited[i]) {
                    queue.add(i); // queue에 추가
                    visited[i] = true; // 방문처리
                }
            }
        }

    } // bfs

}
