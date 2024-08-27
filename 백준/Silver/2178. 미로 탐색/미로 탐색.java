import java.io.*;
import java.util.*;

public class Main {

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean[][] visited;
    static int N, M, res;
    static int[][] maze, dist;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String[] arr = st.nextToken().split("");

            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(arr[j]);
            }
        } // 입력

        dist[0][0] = 1;
        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(dist[N - 1][M - 1]);


    } // main

    private static void bfs(int r, int c) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(r, c)); // add now location

        while (!queue.isEmpty()) {

            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = now.x + dr[i];
                int nc = now.y + dc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && maze[nr][nc] == 1) {
                    queue.add(new Node(nr, nc));
                    visited[nr][nc] = true;
                    dist[nr][nc] = dist[now.x][now.y] + 1;
                }
            }

        }

    } // bfs

}
