
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Dot implements Comparable<Dot>{
        int x;
        int y;

        public Dot(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Dot o) {
            //y좌표가 같을 때
            if(this.y == o.y){
                return this.x - o.x;  //x좌표 증가하는 순
            }
            return this.y - o.y; //y좌표 증가하는 순
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Dot> queue = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){

            st = new StringTokenizer(br.readLine(), " "); //x와 y의 좌표값

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            queue.add(new Dot(x, y));

        }//N개의 점

        //하나씩 출력
        while (!queue.isEmpty()){
            Dot now = queue.poll();
            sb.append(now.x).append(" ").append(now.y).append("\n");
        }

        System.out.println(sb);

    }
}
